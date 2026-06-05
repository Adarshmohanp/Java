public class Association_Customer{
    private int cid;
    private String cname;
    private Association_Account account;//association between customer and account
    private static String bankName="SBI";

    public Association_Customer(int cid, String cname, Association_Account account) {
        this.cid = cid;
        this.cname = cname;
        this.account = account;
    }

    public void disp(){
        System.out.println("Customer Id: "+cid+" Customer Name: "+cname+" Bank Name: "+bankName);
        account.getAccount();


    }
    public static void main(String args[]){
        Association_Account a1=new Association_Account(12345,"Savings",10000);
        Association_Customer c1=new Association_Customer(1,"ABC",a1);
        c1.disp();
    }


}