import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        char ch;
        Calculation obj =new Calculation();
        do {
            int caught = obj.calc();
            obj.count=0;
            if (caught == 1)
                System.out.println("\t\t\tTRUE");
            else if(caught==0)
                System.out.println("\t\t\tFALSE");
            System.out.println("\n\t\tAGAIN [y/n]?");
            ch = scan.next().charAt(0);
        }while(ch=='y'||ch!='n');
    }
}