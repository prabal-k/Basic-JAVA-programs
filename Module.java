import java.util.Scanner;
public class Module {
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter Two numbers: ");
       x= scan.nextInt();
       y= scan.nextInt();
            //CALLING A NON-STATIC METHOD BY CREATING THE OBJECT OF THE CLASS;
       Module obj = new Module();
       z= obj.sum(x,y);
       //z= sum (x,y);
       System.out.println("The Difference is "+z);


    }
     int sum(int a,int b)
    {
        if(a>b)
        {
            return(a-b);
        }
        else
            return(b-a);
    }
}
