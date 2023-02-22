import java.util.Random;
import java.util.Scanner;

public class Game_rsp {
    public static void main(String[] ar) {

        char choi;
        do
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter R[ROCK] P [paper] S[Scissor]");

            choi = obj.next().charAt(0);

        } while (choi != 's' && choi != 'r' && choi != 'p');
        char[] choice={'r','p','s'};
        int ch_num;
        Random random= new Random();
        ch_num=random.nextInt(3);
        System.out.println("The COMPUTER move is: "+choice[ch_num]);
        //System.out.println(choi);
        System.out.println("\n\t\t\t----------GAME BEGINS----------\n\t\t\tUSER MOVE => "+choi+"\n\t\t\tCOMPUTER MOVE => "+choice[ch_num]);
        if(choi=='s'&&choice[ch_num]=='s')
        {
            System.out.println("\n\t\t\tThe game is tie");
        }
        else if (choi=='p'&&choice[ch_num]=='p')
        {
            System.out.println("\n\t\t\tThe game is tie");
        }
        else if (choi=='r'&&choice[ch_num]=='r')
        {
            System.out.println("\n\t\t\tThe game is tie");
        } else if (choi=='r'&&choice[ch_num]=='p')
        {
            System.out.println("\n\t\t\tTHE COMPUTER WINS THE GAME");
        }
        else if (choi=='r'&&choice[ch_num]=='s')
        {
            System.out.println("\n\t\t\tTHE USER WINS THE GAME");
        }
        else if (choi=='p'&&choice[ch_num]=='r')
        {
            System.out.println("\n\t\t\tTHE USER WINS THE GAME");
        }
        else if (choi=='p'&&choice[ch_num]=='s')
        {
            System.out.println("\n\t\t\tTHE COMPUTER WINS THE GAME");
        }
        else if (choi=='s'&&choice[ch_num]=='r')
        {
            System.out.println("\n\t\t\tTHE COMPUTER WINS THE GAME");
        }
        else if (choi=='s'&&choice[ch_num]=='p')
        {
            System.out.println("\n\t\t\tTHE USER WINS THE GAME");
        }
    }

}
