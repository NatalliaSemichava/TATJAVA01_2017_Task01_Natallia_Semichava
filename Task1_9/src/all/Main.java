package all;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        int[] array1,array2,array3;

        int k,n1,n2;
        try{
            n1=Integer.parseInt(args[0]);
            n2=Integer.parseInt(args[1]);
            k=Integer.parseInt(args[2]);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.print("Please, enter 3 numbers: n1 n2 k");
            return;
        }
        if ((k<=0) ||(n1<=0) || (n2<=0)){
            System.out.print("n1, n2 and k must be positive numbers");
            return;
        }

        if (k>n1){
            System.out.print("n1 must be larger k");
            return;
        }

        array1=new int[n1];
        array2=new int[n2];

        System.out.print("First array: ");
        fillArray(0,n1,array1);

        System.out.print("\nSecond array: ");
        fillArray(0,n2,array2);

        System.out.print("\nResult array: ");
        showPartOfArray(0,k,array1);
        showPartOfArray(0,n2,array2);
        showPartOfArray(k,n1,array1);
    }

    public static void fillArray(int beginIndex, int endIndex, int[] array){
        Random rand=new Random();
        for (int i=beginIndex;i<endIndex;i++){
            array[i]=rand.nextInt(10);
            System.out.print(array[i]+" ");
        }
    }

    public static void showPartOfArray(int beginIndex, int endIndex, int[] array){
        for (int i=beginIndex;i<endIndex;i++){
            System.out.print(array[i]+" ");
        }
    }
}
