public class Main {
    public static void main(String[] args)
    {
        try
        {
            int divider=0;
            //throw new Exception();
            int value=100;
            int result=value/divider;
            System.out.println("Result is: "+result);
//            if (divider==0)
//            {
//                throw new Exception();
//
//            }

        }catch(Exception e)
        {
            System.out.println("Error occured"+e);
        }finally
        {
            System.out.println("Inside final block");
        }

        anotherwork();
    }

    public static void anotherwork()

    {
        System.out.println("Another");
    }
}