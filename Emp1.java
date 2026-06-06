//Inheritance

public class Emp1{//fully encapsulated class
    private int eid;
    private String ename;
    private double basic;//basic salary
    private static String org="Google";

    public Emp1(int eid, String ename, double basic) {
        this.eid = eid;
        this.ename = ename;
        this.basic = basic;
    }
    public void disp(){
        System.out.println(eid+" "+ename+" "+basic+" "+org);
    }

    public double getBasic(){
        return basic;
    }

    public void calSalary(){
        //local variables
        int da=42;
        int gra=30;
        int ta=8;//transport allowance

        double salary=basic+(basic*(da+gra+ta)/100);
        System.out.println("Total Salary: "+salary);
    }
}