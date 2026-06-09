//by extending thread class
public class Multithreading18 extends Thread{
    //Thread Scheduler schedules
    @Override
    public void run(){//Critical Section
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());//5
            System.out.println(i);
        try{
            Thread.sleep(750,500);//ms,ns
        }catch(Exception e){
            System.out.println(e);
        }
    }

    }

    public static void main(String args[]) throws Exception{//main thread
        Multithreading18 t1=new Multithreading18();//thread-0 is default thread name when name not set
        t1.setPriority(10);
        t1.start();//Runnable

        t1.join(3000);//throws InterrruptedException
        //when join called, all other thread waits for join to finish its job
        
        Multithreading18 t2=new Multithreading18();//default name thread-1
        t2.setName("second");
        t2.start();

        Multithreading18 t3=new Multithreading18();//default name thread-2
        t3.setName("three");
        t3.start();



        //usually in main thread we don't write any business logic

    }
}