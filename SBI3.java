public class SBI3 implements RBI3{

    public void withdraw(){//should be public as it is public in interface beacause default is public in interface , if we make it default then it will give compile time error because we are reducing the visibility of the method
        System.out.println("Withdraw successful");
    }
    public void deposit(){
        System.out.println("Deposit successful and you got interest: "+interestRate);
    }
    public void transfer(){
        System.out.println("Transfer successful");
    }

    void display(){
        System.out.println("Welcome to SBI ATM");
    }


    public static void main(String args[]){
        RBI3 s=new SBI3();//upcasting
        s.withdraw();
        s.deposit();
        s.transfer();

        SBI3 s1=new SBI3();//no upcasting
        s1.display();
    }
}