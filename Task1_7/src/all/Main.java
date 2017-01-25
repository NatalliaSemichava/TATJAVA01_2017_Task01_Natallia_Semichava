package all;

public class Main {

    public static void main(String[] args) {
	    int a,b,h;
        try{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            h=Integer.parseInt(args[2]);
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.print("Please,enter 3 numbers: a,b,h");
            return;
        }
        if (b<=a){
            System.out.print("Please, b must be larger than a");
            return;
        }
        System.out.println(" x    F(x)");
        double F;
        for(int x=a; x<=b; x+=h){
            F=Math.pow(Math.sin(x),2)-Math.cos(2*x);
            System.out.println(x+"    "+F);
        }
    }
}
