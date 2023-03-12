import java.sql.SQLOutput;

public class Person {
    int age;
    String name;
    Person(int a,String n)
    {
        age=a;
        name=n;
    }
    public void introduce()
    {
        System.out.println("hello,my name is "+name+"And i am "+age+"years old");

    }
}
