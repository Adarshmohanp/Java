public class Synchronised20{


    public synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
            try{
                Thread.sleep(500);

            }catch(Exception e){}
        }
    }
}

class First extends Thread{
    Synchronised20 t;
    public First(Synchronised20 t){
        this.t=t;
    }
    public void run(){
        t.printTable(19);
    }
}


class Second extends Thread{
    Synchronised20 t;
    public Second(Synchronised20 t){
        this.t=t;
    }
    public void run(){
        t.printTable(18);
    }
}

class Third extends Thread{
    Synchronised20 t;
    public Third(Synchronised20 t){
        this.t=t;
    }
    public void run(){
        t.printTable(17);
    }
}
