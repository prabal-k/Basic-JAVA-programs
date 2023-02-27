import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        int age[]=new int[6],i;
        Scanner obj=new Scanner(System.in);
        Vector <Integer> age2=new Vector(3);
        for(i=0;i<age2.capacity();i++)
        {
            age2.add(obj.nextInt());
        }
        System.out.println(age2);
       int  c= age2.remove(1);
        System.out.println(c);

    }
}