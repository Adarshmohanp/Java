public class AnonymousSynchroTest{

    public static void main(String[] args) {
        
    AnonymousSynchro21 a=new AnonymousSynchro21();

    //anonymous inner class
    Thread t1=new Thread(){
        public void run(){
            a.printCapitals();
        }
    };
    t1.start();

    Thread t2=new Thread(){
        public void run(){
            a.printSmaller();
        }
    };
    t2.start();
}
}