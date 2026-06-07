package in.kerala;

public class package9 {
    private int a;

    public package9(int a){
        this.a=a;
    }

    public void getA(){
        System.out.println("Value of a is: " + a);
    }

    public static void main(String args[]){
        package9 obj=new package9(10);
        obj.getA();
    }
}