import java.util.Scanner;

public class Recursion
{
    public static void main(String[] args) {
        int a[][]={{1,2,3,7},
                {4,5,6,9},
                {9,10,67,100}};
        int b[]={7,8,9,10},i=0,j=0;
        int c[][]=new int[3][4];
        //int d[]=new int[5];
        Scanner obj=new Scanner(System.in);
        //System.out.println(a[0][1]);
//        for(i=0;i<4;i++)
//        {
//            System.out.println(b[i]);
//        }
//        System.out.println("Printing 1-D using for each loop");
//        for(int x:b)
//        {
//            System.out.println(x);
//        }
        System.out.println("Printing 2-D array: ");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Enter the elenents in 2-D array: ");
        for(i=0;i<c.length;i++)
        {
            for(j=0;j<c[i].length;j++)
            {
                c[i][j]=obj.nextInt();
            }
        }
        System.out.println("The new 2-D array is: ");
        for(i=0;i<c.length;i++)
        {
            for(j=0;i<c[i].length;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
