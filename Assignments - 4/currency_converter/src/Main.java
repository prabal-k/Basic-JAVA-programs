import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //TO PRINT MENU
        Main obj = new Main();
        Scanner object = new Scanner(System.in);
        System.out.println("*****MENU*****");
        System.out.println("1) RS TO $\n2) $ TO RS");
        //TO GET THE INPUT FROM USER:
        int choice = getinput(object);
        switch(choice)
        {
            case 1:
                rstodollar(object);
                break;
            case 2:
                obj.dollartors(object);
                break;
            default:
                System.out.println("Invalid input:");

        }
    }
    static int getinput(Scanner object)
    {
        System.out.println("Enter your choice: ");

        int ch = object.nextInt();
        return ch;

    }
    static void rstodollar(Scanner object)
    {
        System.out.println("Enter the RS to convert into dollar: ");
        double money=object.nextDouble();
        System.out.println(money+" RS ="+money/135.03+ " $");
    }
    void dollartors(Scanner object)
    {
        System.out.println("Enter the dollar to convert into RS: ");
        double money=object.nextDouble();
        System.out.println(money+" $ ="+money*135.03+" RS");
    }

}