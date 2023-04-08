import java.util.Scanner;

public class Main {
    static Scanner obj = new Scanner(System
            .in);
    static int sum;
    static int i=0;
    static int j=0;
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter how much number you want in array: ");
        n= obj.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter "+ n + " number is array: ");
        while(n>0)
        {
            //sum=0;
            arr[j]=obj.nextInt();
            sum = sum+arr[j];
            j++;
            n--;
        }
        System.out.println("The sum of array is: "+sum);


    }
}