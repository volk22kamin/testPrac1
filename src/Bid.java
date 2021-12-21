public class Bid {
    

    private Person person;
    private int bidValue;


    public Bid(Person person, int bidValue) {
        this.person = person;
        this.bidValue = bidValue;
    }
    
    public Bid(Bid bid) {
        this.person = bid.person;
        this.bidValue = bid.bidValue;
    }


    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public int getBidValue() {
        return bidValue;
    }
    public void setBidValue(int bidValue) {
        this.bidValue = bidValue;
    }
    @Override
    public String toString() {
        return "Bid [bidValue=" + bidValue + ", person=" + person + "]";
    }

    
}
