import java.util.Scanner;

public class Multiplication
{
    int input()
    {
        System.out.println("Enter the number to print the multiplication table: ");
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        return num;
    }
    void calculation(int number)
    {
        System.out.println("Multiplication table of "+number+" is :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(number +"*"+ i + "=" +  (number*i));
        }
    }
}
