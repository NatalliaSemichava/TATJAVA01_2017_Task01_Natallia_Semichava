package all;

public class Main {

    public static void main(String[] args) {

        double x,y;
        try{
            x=Double.parseDouble(args[0]);
            y=Double.parseDouble(args[1]);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.print("Please, enter 2 numbers: x y");
            return;
        }
        boolean flag = ((x<=2) && (x>=-2) && (y>=0) && (y<=4));
        if ((x<=4) && (x>=-4) && (y>=-3) && (y<=0)){
            flag=true;
            if ( Math.pow(0-x,2)+Math.pow(-1-y,2) <= Math.pow(0.5,2)){
                flag=false;
            }
        }

        System.out.print(flag);
    }
}
