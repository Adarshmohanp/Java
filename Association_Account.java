public class Association_Account{
    private int accNo;
    private String accType;
    private double accBalance;

    public Association_Account(int accNo, String accType, double accBalance) {
        this.accNo = accNo;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    public void getAccount(){
        System.out.println("Account No: "+accNo+" Account Type: "+accType+" Account Balance: "+accBalance); 
        
    }
}