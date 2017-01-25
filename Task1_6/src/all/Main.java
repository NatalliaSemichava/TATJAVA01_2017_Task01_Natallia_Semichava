package all;

public class Main {

    public static void main(String[] args) {
	    double[] numbers = new double[3];
        try{
            for (int i=0;i<3;i++){
                numbers[i]=Double.parseDouble(args[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.print("Please, enter 3 numbers!");
            return;
        }
        double min=numbers[0];
        double max=numbers[0];
        for (int i=1;i<3;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.print(min+max);

    }
}
