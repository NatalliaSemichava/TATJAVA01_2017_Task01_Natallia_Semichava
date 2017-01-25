package all;

public class Main {

    public static void main(String[] args) {
        try {
            if (args[0].length() != 4) { //не 4 цифры
                System.out.print("Please, enter four-digit number!");
                return;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){ //запуск без аргументов
            System.out.print("You need to enter four-digit number!");
            return;
        }
        try {
            int number1 = GetByIndex(args[0],0,1) + GetByIndex(args[0],1,2);
            int number2 = GetByIndex(args[0],2,3) + GetByIndex(args[0],3,4);
            System.out.print(number1 == number2);
        }
        catch (NumberFormatException e){ //ввод не числа
            System.out.print("Please, enter four-digit number!");
            return;
        }
    }
    public static int GetByIndex(String str,int i,int j)
    {
        return Integer.parseInt(str.substring(i,j));
    }
}
