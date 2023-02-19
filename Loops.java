import java.util.Scanner;
public class Loops
{
    public static void main(String[] args)
    {
        int a[]=new int[10];
        int i;
        Scanner scan =new Scanner(System.in);
         System.out.println("Enter 5 values: ");
        for(i=0;i<5;i++)
        {
            a[i]=scan.nextInt();
        }
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

    }
}