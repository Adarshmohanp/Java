//Interface extends another interface

public class A4 implements Printable4{
    public void print(){
        System.out.println("Printing...");
    }
    public void show(){
        System.out.println("Showing...");
    }
    public static void main(String args[]){
        Printable4 p=new A4();
        p.print();
        p.show();
    }

}