import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
        File file =new File("object_data.txt");

        //TO WRITE AN OBJECT IN FILE
        FileOutputStream fileOutputStream= new FileOutputStream("object_data.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        Person person=new Person();
        objectOutputStream.writeObject(person);

        //TO READ THE OBJECT FROM FILE
        FileInputStream fileInputStream=new FileInputStream("object_data.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Person person1=(Person) objectInputStream.readObject();
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);

        System.out.println(person1.number);


    }
}