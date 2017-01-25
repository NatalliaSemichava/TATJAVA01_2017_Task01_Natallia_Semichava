package all;

public class Main {

    public static void main(String[] args) {
	    double a=0,b=0;
        try{
            a=Double.parseDouble(args[0]);
            b=Double.parseDouble(args[1]);
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.print("Please, enter two numbers: a b");
            return;
        }
        if ((a<=0) || (b<=0)){
            System.out.print("Please, enter positive numbers!");
            return;
        }
        double P,S;
        P=a+b+(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        S=0.5*a*b;
        System.out.println("Периметр равен "+P);
        System.out.println("Площадь равна "+S);
    }
}
