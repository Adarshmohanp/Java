import java.io.Serializable;
public class Person17 implements Serializable{
    private String name;
    private int age;
    transient private long aadhar;//cann't be serialized by using keyword transient

    public Person17(String name, int age, long aadhar){
        this.name=name;
        this.age=age;
        this.aadhar=aadhar;
    }

    @Override
    public String toString(){
        return "Person{name='" + name + "', age=" + age + ", aadhar=" + aadhar + "}";
    }

}