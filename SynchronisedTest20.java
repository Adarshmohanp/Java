public class SynchronisedTest20{
    public static void main(String[]args){
        Synchronised20 t=new Synchronised20();

        First t1=new First(t);
        t1.start();

        Second t2=new Second(t);
        t2.start();

        Third t3=new Third(t);
        t3.start();
    }
}