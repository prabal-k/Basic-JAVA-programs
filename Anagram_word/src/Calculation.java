import java.util.Scanner;

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
            if (length1 == length2) {
                for (int i = 0; i < length1; i++)
                {
                    for (int j = 0; j < length2; j++)
                    {
                        if (ch1[i] == ch2[j])
                        {
                            count++;
                            //break;
                        }
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

