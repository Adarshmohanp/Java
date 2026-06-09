//by extending thread class
public class Multithreading18 extends Thread{
    //Thread Scheduler schedules
    public void run(){//Critical Section
        for(int i=1;i<=10;i++)
            System.out.println(i);

    }

    public static void main(String args[]){//main thread
        Multithreading18 t1=new Multithreading18();//thread created -t1
        t1.start();//Runnable
        
        Multithreading18 t2=new Multithreading18();
        t2.start();

        //usually in main thread we don't write any business logic

    }
}