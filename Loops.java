import java.util.Scanner;
//import java.util.Array;
public class Loops
{
    public static void main(String[] args)
    {
        int a[]=new int[10];
        int i=0,j=0,temp;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 5 values: ");
        while(i<5)
        {
            a[i]=scan.nextInt();
            i++;
        }
        //array.sort(a);
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The value in last array index is: "+a[0]);
        


        //  FOR LOOPS TO INPUT AND DISPLAY ARRAYS

        // for(i=0;i<5;i++)
        // {
        //     a[i]=scan.nextInt();
        // }
        // for(i=0;i<5;i++)
        // {
        //     System.out.println(a[i]);
        // }

    }
}