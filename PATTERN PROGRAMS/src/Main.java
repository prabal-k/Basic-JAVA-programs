import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int i, j, ch,choi=0;
        do
        {
            display();
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            ch = obj.nextInt();
            System.out.println("Enter the number of rows you want: ");

            i = obj.nextInt();
            System.out.println("Enter the number of column you want: ");
            j = obj.nextInt();
            ch1 obj2 = new ch1();
            ch2 obj3 = new ch2();
            ch3 obj4 = new ch3();
            ch4 obj5= new ch4();
            ch5 obj6 =new ch5();
            switch (ch) {
                case 1:
                    obj2.output(i, j);
                    break;
                case 2:
                    obj3.output(i, j);
                    break;
                case 3:
                    obj4.output(i, j);
                    break;
                case 4:
                    obj5.output();
                    break;
                case 5:
                    obj6.output();
                    break;

            }
            System.out.println("Want to print next pattern (y/n): ");
            choi = obj.next().charAt(0);
        }while (choi != 'n') ;



    }
    static void display()
    {
        int ch;
        System.out.println("1)\n*****\n****\n***\n**\n*");
        System.out.println("2)\n*****\n*****\n*****\n*****\n*****");
        System.out.println("3)\n\t *\n\t***\n   *****\n\t***\n\t *");
        System.out.println("4)\nN\nNE\nNEP\nNEPA\nNEPAL");
        System.out.println("5)\nNEPAL\nNEPA\nNEP\nNE\nN");

    }
}