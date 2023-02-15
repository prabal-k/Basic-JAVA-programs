import java.util.Scanner;
public class Scannertest
{
    public static void main(String [] args)
    {
        System.out.println("Enter your name: ");
        Scanner object = new Scanner(System.in);
        
        String name= object.nextLine();
        
        System.out.println("Your name is: "+name);
        
    }
}