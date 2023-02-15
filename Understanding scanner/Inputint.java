import java.util.Scanner;
public class Inputint
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THE NUMBER: ");
        Scanner obj = new Scanner (System.in);
        int num = obj.nextInt();
        System.out.println("Result is " + num + "*50 = " + num*50);


    }
}