import java.io.*;
public class SerializableTest17{
    public static void main(String[]args) throws Exception{
        Person17 p= new Person17("John Doe", 30, 123456789012L);
        System.out.println("Original Person: " + p);//p.toString() is called implicitly
        //Serialization
        FileOutputStream fos= new FileOutputStream("person.ser");// any extension can be used
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(p);

        //Deserialization
        FileInputStream fis= new FileInputStream("person.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Person17 p1=(Person17) ois.readObject();//java.lang.Object is returned, so we need to cast it to Person17 beacuse downcasting not allowed without explicit cast
        System.out.println("Deserialized Person: " + p1);
    }
}