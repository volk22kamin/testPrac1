import java.util.Arrays;
import java.util.Scanner;

public class MyArr {
    
    private int[] arr;
    private boolean simetric;
    Scanner s = new Scanner(System.in);


    public MyArr(int num){
        if(num % 2 == 0){
            this.arr = new int[num];
            System.out.println("enter numbers:");
            for(int i = 0; i < num; i++){
                arr[i] = s.nextInt();
            }
        }
    }

    public boolean checkSim(){
        int len = arr.length;
        for(int i = 0; i < len / 2; i++){
            if(arr[i] != arr[len - i - 1]){
                simetric = false;
                return simetric;
            } else {
                simetric = true;
            }
        }
        return simetric;
    }

    public float avg(){
        float sum = 0;
        if(this.simetric == true){
            for(int i = 0; i < arr.length / 2; i++){
                sum += arr[i];
            }
            sum /= arr.length / 2;
        } else {
            sum = (arr[0] + arr[arr.length - 1]) / 2;
        }
        return sum;
    }
    @Override
    public String toString() {
        return "MyArr [arr=" + Arrays.toString(arr) + ", simetric=" + simetric + "]";
    }

    

    
}
