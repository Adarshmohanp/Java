class Bank2 extends ATM2{

    int cashback;//child specific member  -interest rate from parent

    public Bank2(double interestRate, int cashback) {
        super(interestRate);
        this.cashback = cashback;
    }

    void withdraw(){
        System.out.println("Withdraw successful");
        System.out.println("Congrats...You got Cashback: " + cashback);
    }

    void deposit(){
        System.out.println("Deposit successful");
        System.out.println("Congrats...You got interest: " + interestRate);
    }

    @Override
    void display(){
        super.display();//calling parent class method
        System.out.println("Welcome to Bank ATM");
    }

    void fun(){
        System.out.println("It's a child spcific method");
    }

    public static void main(String args[]){
        ATM2 b=new Bank2(8.5,30);//upcasting
        b.display();
        b.withdraw();
        b.deposit();
        //b.fun();//compile time error- parent class reference variable cannot access child class specific members
        Bank2 b1=new Bank2(8.5,30);//no upcasting
        b1.fun();
    }

}