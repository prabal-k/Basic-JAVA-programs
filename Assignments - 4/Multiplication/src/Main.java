import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        do {

            Scanner object = new Scanner(System.in);
            //TO TAKE THE INPUT NUMBER FROM USER
            Multiplication mult = new Multiplication();
            int num2 = mult.input();
            //TO CALL CALCULATION FUNCTION TO CALCULATE THE TABLE
            mult.calculation(num2);
            System.out.println("Do you again want to enter another number: (y/n)");
            ch = object.next().charAt(0);

        }while(ch=='y'||ch!='n');
    }
}