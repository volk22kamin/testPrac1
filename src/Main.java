


public class Main{

   
    public static Mobile mostExp(Mobile[] arr){
        Mobile most = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i].getPrice() > most.getPrice()){
                most = arr[i];
            }
        }
        return most;
    }
    public static void main(String[] args) {
        
        Person me = new Person("volk");

        Item i1 = new Item("vase");
        Item i2 = new Item("car");
        Item i3 = new Item("coin");
        Item i4 = new Item("mirror");
        Item i5 = new Item("table");
        Item i6 = new Item("wine");
        Auction auc = new Auction();

        auc.addItem(i1);
        auc.addItem(i2);
        auc.addItem(i3);
        auc.addItem(i4);
        auc.addItem(i5);
        auc.addItem(i6);

        System.out.println(auc);
        System.out.println();
        Bid myBid = new Bid(me, 150);
        Bid secBid = new Bid(me, 10000);



            System.out.println(auc.getItemsArr().length);
            auc.bidAccepted(1006, myBid);
            auc.bidAccepted(1007, myBid);
            auc.bidAccepted(1008, secBid);
            auc.bidAccepted(1009, myBid);
            auc.bidAccepted(1010, myBid);
            auc.bidAccepted(1011, myBid);
           
          
            
            System.out.println(auc);
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println(auc);
            System.out.println(auc.getItemsSold());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(auc.getMostExpensiveSold());
       






















        // Mobile m1 = new Mobile("nexus5", 1600, 30);
        // Mobile m2 = new Mobile(m1.getModel(), m1.getPrice() / 2, 25);
        // Mobile m3 = new Mobile("iph", 2050, 45);
        // Mobile m4 = new Mobile("sams", 1800, 32);
        // Mobile mobileArr[] = {m1,m2,m3,m4};

        // System.out.println(mostExp(mobileArr));

        // System.out.println("part 2");
        // m1.setMsize(4);
        // System.out.println(m2.compare(m1));


        // MyArr m = new MyArr(6);
        // m.checkSim();
        // System.out.println(m);
        // System.out.println(m.avg());


        // Coin dollar = new Coin(150, "lincoln");
        // System.out.println(dollar);
        // dollar.flip();
        // System.out.println(dollar);

        // Coin dime = new Coin(10, "grant");
        // System.out.println(dollar.sumofTwo(dime));
        // System.out.println(dime);
    }
}