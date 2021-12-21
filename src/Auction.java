import java.util.Arrays;

public class Auction {
    

    private Item[] itemsArr;
    private static int itemsCreated = 0;
    private static int itemsSold = 0;
    private static int mostExp = 0;

    public Auction() {
        this.itemsArr = new Item[6];
    }

    public void addItem(Item item){
        itemsArr[itemsCreated++] = new Item(item);
    }
    public boolean bidAccepted(int itemNumber, Bid bid){

        for(int i = 0; i < itemsArr.length; i++){
            
                if(itemsArr[i].getItemNumber() == itemNumber ){
    
                    if(itemsArr[i].bidFor(bid)){
                        this.itemsSold++;
                        mostExpensitveItem(itemsArr[i]);
                        System.out.println("bid accepted for item number " + itemNumber + " for " + bid.getPerson().getName());
                        return true;
                    } else {
                        return false;
                    }
                } 
            }



        return false;
    }



    public void mostExpensitveItem(Item item){
        if(item.getHighestBid() > this.mostExp){
            this.mostExp = item.getHighestBid();
        }
    }
    
    public String getMostExpensiveSold(){
        for(int i = 0; i < itemsArr.length; i++){
            if(itemsArr[i].getHighestBid() == this.mostExp){
                return itemsArr[i].getName();
            }
        } 
        return itemsArr[0].getName();
    }
    public Item[] getItemsArr() {
        return itemsArr;
    }

 

    public static int getItemsCreated() {
        return itemsCreated;
    }


    public static int getItemsSold() {
        return itemsSold;
    }

    @Override
    public String toString() {
        return "Auction [itemsArr=" + Arrays.toString(itemsArr) + "]";
    }

  





    
}
