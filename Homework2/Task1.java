import java.util.Scanner;

public class Main{

    public static void main(String[] args) 
    {
            float number = getFloatTypeNumber();
            System.out.println("Ваше введённое число: " + number);
    }

    public static float getFloatTypeNumber()
    {
            Scanner scanner = new Scanner(System.in);
            float number = 0d;
            boolean validNumber = false;

            while(!validNumber)
            {
                System.out.println("Введите дробное число: ");
                if(scanner.hasNextFloat())
                {
                        number = scanner.nextFloat();
                        validNumber = true;
                }
                else
                {
                        System.out.println("Введено не дробное число: ");
                        scanner.next();

                }
                
            }

    }

}