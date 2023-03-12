import java.sql.SQLOutput;

//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class Main {
    public static void main(String[] args)
    {
        Main object = new Main();
        Shape obj = new Shape(10, 40);
        System.out.println("Height is: " + Shape.height);
        System.out.println("Weight is: " + obj.weight);
        obj.area();
        hello obj2=new hello();
        obj2.size();
        obj2.disc();
    }
    

}
class hello
{
    public void size()
    {
        System.out.println("I AM inside size class().");
    }
    public void disc()
    {
        System.out.println("I am inside disc class(). ");
    }
}