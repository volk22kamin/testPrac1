public class Item {
    
    private static int idCount = 1000;
    private int itemNumber;
    private String name;
    private int highestBid;
    private boolean isSold;


    public Item( String name) {
        this.itemNumber = idCount++;
        this.name = name;
        this.highestBid = 0;
        this.isSold = false;
    }

    public Item(Item item){
        this.itemNumber = item.idCount++;
        this.name = item.name;
        this.highestBid = 0;
        this.isSold = false;
    }

    public int getItemNumber() {
        return itemNumber;
    }


    public String getName() {
        return name;
    }

    

    public int getHighestBid() {
        return highestBid;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }

    public boolean bidFor(Bid bid){
        if(bid.getBidValue() > this.highestBid && isSold == false){
            this.highestBid = bid.getBidValue();
            this.isSold = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Item [highestBid=" + highestBid + ", isSold=" + isSold + ", itemNumber=" + itemNumber + ", name=" + name
                + "]";
    }

    
}
