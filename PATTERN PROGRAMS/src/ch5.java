import java.util.Scanner;

public class ch5 {
    static void output()
    {
        Scanner input =new Scanner(System.in);
        //TO TAKE A STRING AS INPUT
        System.out.println("Enter the string you want to print: ");
        String name = input.nextLine();
        //TO PRINT THE STRING IN PATTERN
        for(int i=name.length()-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(name.charAt(j));
            }
            System.out.print("\n");
        }
    }
    }

