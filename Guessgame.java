import java.util.*;
public class Guessgame
{
    public static void main(String[] ar)
    {
        Random obj = new Random();
        int x=obj.nextInt(50);
        System.out.println(x);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number in between 1-50: ");
        int a= input.nextInt();
        if(a<x)
        {
            System.out.println("Your guess is too low...Try Guessing higher...");

        }
        else if(a>x)
        {
            System.out.println("Your guess is too high....Try Guessing lower...");
        }
    }
}