import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random obj = new Random();

        int a = 0;
        char ch;

        Scanner input = new Scanner(System.in);
        do {
            int x = obj.nextInt(25), i = 4;
        System.out.println("\t\tGuess a number in between 0-25: ");


            while (i >= 0) {

                a = input.nextInt();


                if (a < x) {
                    System.out.println("\t\tYour guess is too low๐๐...Try Guessing higher โคด๏ธ...[chance left: " + i + "]");

                } else if (a > x) {
                    System.out.println("\t\tYour guess is too high๐๐...Try Guessing lower โคต๏ธ...[chance left: " + i + "]");
                } else if (a == x) {

                    System.out.println("\t\tCongratulation your guess is correct ๐๐  i.e " + a + " ...You won the game...๐๐");
                    System.exit(0);

                }
                i--;

            }
            i=4;
            if (a != x) {
                System.out.println("\t\tOOPS!...Sorry Chance over.");
                //System.out.println("\t\tYou should have guessed: " + x);
            }
            System.out.println("\t\tDo you want to play again: (y/n) :");
            ch=input.next().charAt(0);
        }while(ch!='y'||ch!='Y');

    }
}

