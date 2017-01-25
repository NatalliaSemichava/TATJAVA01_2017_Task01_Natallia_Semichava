package all;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random rand=new Random();
        int[] array;
        int k,n;
        try {
            n=Integer.parseInt(args[0]);
            k=Integer.parseInt(args[1]);
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.print("Please, enter 2 numbers: n k");
            return;
        }
        if (n<=0){
            System.out.print("n must be a positive number");
            return;
        }
        array = new int[n];
        int S=0;
        for (int i=0;i<n;i++){
            array[i]=rand.nextInt(100);
            System.out.print(array[i]+" ");
            if (array[i]%k==0){
                S+=array[i];
            }
        }
        System.out.print("\nSum="+S);
    }
}
