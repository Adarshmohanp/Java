public class InterThreadTest22{
    public static void main(String[] args){
        InterThread22 i = new InterThread22(25000);
        // anonymous inner classes and anonymous Thread objects

        new Thread(){
            public void run(){
                i.withdraw(30000);
            }
        }.start();

        new Thread(){
            public void run(){
                i.deposit(25000);
            }
        }.start();
    }
}