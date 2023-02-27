
import java.util.Scanner;
public class Array1 {
    public static void main(String[] arg)
    {
        int a[]=new int[5];
        int b[]={20,30,40};
        int i;
        String[] arr2=new String[5];
        Scanner obj=new Scanner(System.in);

        String arr[]=new String[30];
        System.out.println("a>> " +a);
        System.out.println("b>> " +b);
        System.out.println("arr>> " +arr);
        System.out.println("Enter the elements in array: ");
//        for(i=0;i<5;i++)
//        {
//            a[i]=obj.nextInt();
//
//        }
//        for(int c:a)
//        {
//            System.out.println(c);
//        }
//        for(i=0;i<5;i++)
//        {
//            System.out.println(a[i]);
//
//        }
        for(i=0;i<5;i++)
        {
            arr2[i]=obj.nextLine();
        }
        for(i=0;i<5;i++)
        {
            System.out.print(arr2[i]);
        }

    }

}
