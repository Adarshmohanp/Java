public class AnonymousSynchro21{
    public synchronized void  printCapitals(){
        for(int i=65;i<=90;i++){
            System.out.println((char)i+" ");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public synchronized void printSmaller(){
        for(int i=97;i<=122;i++){
            System.out.println((char)i+" ");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }


}