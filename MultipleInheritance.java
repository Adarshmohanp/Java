
//Multiple Inheritance using interfaces only possible in Java 
interface Printable{
    void print();
}

interface Showable{
    void show();
}

public class MultipleInheritance implements Printable,Showable{
    public void print(){
        System.out.println("Printing...");
    }
    public void show(){
        System.out.println("Showing...");
    }
    public static void main(String args[]){
        MultipleInheritance m=new MultipleInheritance();
        m.print();
        m.show();
    }

}