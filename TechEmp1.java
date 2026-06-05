//Inheritance

public class TechEmp1 extends Emp1{

    //inherited members - non-private 
    //child specific members
    int bonus;
    public void setBonus(int bonus){
        this.bonus=bonus;
    }

    
    //re-defining display method
    @Override //annotation
    public void disp(){
        super.disp();//calling parent class method
        System.out.println("Bonus: "+bonus);
    }


    //re-defining the method of parent class Emp1- method overriding
    @Override //annotation
    public void calSalary(){//method signature must be same as parent class method
        //local variables
        int da=42;
        int gra=30;
        int ta=8;//transport allowance

        double salary=getBasic()+(getBasic()*(da+gra+ta)/100 +bonus);
        System.out.println("Total Salary: "+salary);
    }

    public static void main(String args[]){
        TechEmp1 te=new TechEmp1();
        te.setEmp(123,"ABC",50000);
        te.setBonus(10000);
        te.disp();
        te.calSalary();
    }
    

}