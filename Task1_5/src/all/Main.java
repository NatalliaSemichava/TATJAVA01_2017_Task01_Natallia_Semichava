package all;

public class Main {

    public static void main(String[] args) {
	    double[] numbers=new double[3];
        try{
            for (int i=0;i<3;i++){
                numbers[i]=Double.parseDouble(args[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.print("Please, enter 3 numbers!");
            return;
        }
        for (int i=0;i<3;i++){
            if (numbers[i]<0){
                numbers[i]=Math.pow(numbers[i],4);
            }
            else{
                numbers[i]=Math.pow(numbers[i],2);
            }
        }
        System.out.print("The first number="+numbers[0]+", the second number="+numbers[1]+", the third number="+numbers[2]);
    }
}
