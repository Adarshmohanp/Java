//by extending thread class
public class Multithreading18 extends Thread{
    //Thread Scheduler schedules
    @Override
    public void run(){//Critical Section
        for(int i=1;i<=10;i++){
            System.out.println(i);
        try{
            Thread.sleep(1000,500);//ms,ns
        }catch(Exception e){
            System.out.println(e);
        }
    }

    }

    public static void main(String args[]) throws Exception{//main thread
        Multithreading18 t1=new Multithreading18();//thread created -t1
        t1.start();//Runnable

        t1.join(5000);//throws InterrruptedException
        //when join called, all other thread waits for join to finish its job
        
        Multithreading18 t2=new Multithreading18();
        t2.start();

        Multithreading18 t3=new Multithreading18();
        t3.start();



        //usually in main thread we don't write any business logic

    }
}