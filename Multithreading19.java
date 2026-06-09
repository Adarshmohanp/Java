public class Multithreading19 implements Runnable{
    public void run(){//Critical Section
        for(int i=1;i<=10;i++)
            System.out.println(i);

    }

    public static void main(String args[]){//main thread
       Runnable r1=new Multithreading19();
       Runnable r2=new Multithreading19();

       Thread t1=new Thread(r1);
       Thread t2=new Thread(r2);

       t1.start();//runnable
       t2.start();//runnable

       //if we directly call run method , it will behave as normal method
       //t1.run();//normal method
       //t2.run();
    }
}