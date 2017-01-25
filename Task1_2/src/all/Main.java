package all;

public class Main {

    public static void main(String[] args) {
        double a,b,c;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.print("Please, enter 3 numbers: a b c");
            return;
        }
        double result = ((b+Math.sqrt(b*b+4*a*c))/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
        if((!Double.isNaN(result)) && (!Double.isInfinite(result))) {
            System.out.print("Result = " + result);
        }
        else{
            System.out.print("Arithmetic exception!");
        }
    }
}
