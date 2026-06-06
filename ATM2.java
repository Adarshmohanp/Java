abstract class ATM2{//2/3 abstraction

    double interestRate;

    public ATM2(double interestRate) {
        this.interestRate = interestRate;
    }
    abstract void withdraw();
    abstract void deposit();

    //concrete method
    void display(){
        System.out.println("Welcome to ATM");
    }


}