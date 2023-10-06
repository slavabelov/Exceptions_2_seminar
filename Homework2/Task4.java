import java.util.Scanner;

public class Main{

    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите строку: ");
         String inputLine = scanner.nextLine();


         try
         {
                if(inputLine.isEmpty())
                {
                    throw new Exception("Пустые строки не вводим!: ");
                }
                else
                {
                    System.out.println("Вы ввели следующую строку: " + inputLine);
                }

         }
         catch(Exception ex)
         {
                System.out.println(ex.getMessage());
         }

        
    }

}