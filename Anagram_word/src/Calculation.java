import java.util.Scanner;
import java.util.Arrays;
public class Calculation {
    public static Scanner scan = new Scanner(System.in);
    static int flag = 0;
    static  int count = 0;
    public static int calc()
    {
            System.out.println("Enter the first word: ");
            String arr = scan.nextLine();
            System.out.println("Enter the second word: ");
            String arr2 = scan.nextLine();
            int length1 = arr.length();
            int length2 = arr2.length();
            char ch1[] = arr.toCharArray();
            char ch2[] = arr2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            //String st = new String(ch1);
            //String st2 = new String(ch2);
            //System.out.println(ch1+" "+ch2);

                if (length1 == length2) {
                    for (int i = 0; i < length1; i++)
                         {
                            if (ch1[i] == ch2[i]) {
                                count++;
                                //break;
                            }
                        }
                    }
            else
                return 0;
            if (count == length1)
                return 1;
            else
                return 0;
    }
}

