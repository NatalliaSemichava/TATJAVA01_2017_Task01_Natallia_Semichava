package all;

public class Main {

    public static void main(String[] args) {

        int n;
        try{
            n=Integer.parseInt(args[0]);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.print("Please, enter a number n");
            return;
        }
        if ((n%2!=0) ||(n<=0)){
            System.out.print("n must be a positive and even number");
            return;
        }
        int[][] array=new int[n][n];
        for (int i=0;i<n;i++){
            int n2=n;
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        array[i][j] = j+1;
                    } else {
                        array[i][j] = n2;
                        n2--;
                    }
                    System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }
    }
}
