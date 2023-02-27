class employee{
    int id;
    String name;
    public void setvalues(int id1, String name1)
    {
        id=id1;
        name=name1;
        display();
    }
    public void display()
    {
        System.out.println("Name of employee is: "+name);
        System.out.println("Id of employee is: "+ id);
    }

}

public class Own_class {
    public static void main(String[] args)
    {
        employee ram=new employee();
        ram.setvalues(10,"ram thapa");
    }

}
