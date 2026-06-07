interface ABC{//with java 9 features
    void absMethod();

    default void msg(){
        System.out.println("Default method");
        privateMethod();
    }

    static void fun(){
        System.out.println("Static method");
        privateStaticMethod();

    }

    private void privateMethod(){
        System.out.println("Private method");
    }

    private static void privateStaticMethod(){
        System.out.println("Private static method");
    }


}

public class XYZ5 implements ABC{
    public void absMethod(){
        System.out.println("Abstract method implemented");
    }

    public static void main(String args[]){
        XYZ5 a=new XYZ5();
        a.absMethod();
        a.msg();
        ABC.fun();
        //a.privateMethod(); //cannot access private method
        //ABC.privateStaticMethod(); //cannot access private static method
    }
}