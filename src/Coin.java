import java.util.Random;

public class Coin {
    
    private int value;
    private String faceName;
    private String side;
    Random rand = new Random();


    public Coin(int value, String faceName) {
        this.value = value;
        this.faceName = faceName;
        String sides[] = {"heads", "tales"};

        this.side = sides[rand.nextInt(sides.length)];

    }

    public int getValue() {
        return value;
    }

  

    public String getFaceName() {
        return faceName;
    }

 

    public String getSide() {
        return side;
    }

    public int sumofTwo(Coin c){
        return this.value + c.value;
    }

    public void flip(){
        if(this.side == "heads"){
            this.side = "tales";
        } else {
            this.side = "heads";
        }
    }

    @Override
    public String toString() {
        return "Coin [faceName=" + faceName + ", value=" + value + ", side=" + side + "]";
    }
    

    

    


}
