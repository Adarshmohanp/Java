public class InterThread22{
    double balance;
    public InterThread22(double balance){
        this.balance=balance;
    }
    public void getBalance(){
        System.out.println("Balance: "+balance);
    }

    public synchronized void withdraw(double amount){
        System.out.println("going to withdraw:");
        if(amount>balance){
            System.out.println("Less balance: waiting for deposit");
            try{
                wait();//ITC- inter thread communication
            }catch(Exception e){
                System.out.println(e);
            }
        }
        balance = balance -amount;
        System.out.println("withdraw completed");
        getBalance();
    }

    public synchronized void deposit(double amount){
        System.out.println("going to deposit");
        balance = balance + amount;
        System.out.println("Deposit completed");
        getBalance();
        notify();//ITC
    }
}