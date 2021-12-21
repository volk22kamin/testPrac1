public class Mobile {
    
    private String model;
    private int price;
    private double memoSize;


    public Mobile(String model, int price, double memoSize) {
        this.model = model;
        this.price = price;
        this.memoSize = memoSize;
    }
    
    public void setMsize(double a){
        if(a > 0){
            this.memoSize = a;
        }
    }

    public boolean compare(Mobile mob){
        if(this.model.equals(mob.model) && this.price < mob.price){
            return true;
        } else {
            return false;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMemoSize() {
        return memoSize;
    }

    public void setMemoSize(double memoSize) {
        this.memoSize = memoSize;
    }

    @Override
    public String toString() {
        return "Mobile [memoSize=" + memoSize + ", model=" + model + ", price=" + price + "]";
    }
    
}
