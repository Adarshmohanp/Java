public class Outer6{//default, public , final, abstract, strictfp

    private int data=99;

    class Inner{
        void msg(){
            System.out.println("Data of outer class is: " + data);
        }
    }

    void display(){
        System.out.println("Outer class method");
        //Inner in=new Inner();
        //in.msg(); this method also possible -> in exists in out object
    }

    public static void main(String args[]){
        Outer6 out=new Outer6();
        out.display();

        Outer6.Inner in=out.new Inner();
        in.msg();
    }

}