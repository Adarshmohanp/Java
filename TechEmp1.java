//Inheritance
//Run time polymorphism- method overriding

public class TechEmp1 extends Emp1{

    //inherited members - non-private 
    //child specific members
    int bonus;
    public TechEmp1(int eid, String ename, double basic, int bonus) {
        super(eid, ename, basic);
        this.bonus = bonus;

    }

    
    //re-defining display method
    @Override //annotation to indicate that this method is overriding a parent class method (if no overriding is happening, it will give compile time error)
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
        //TechEmp1 te=new TechEmp1(123,"ABC",50000,10000);
        //te.disp();
        //te.calSalary();

        Emp1 te=new TechEmp1(123,"ABC",50000,10000);
        te.disp();//overriden- RTP
        te.calSalary();//overriden- RTP


        System.out.println("******************");
        Emp1 e1=new Emp1(123,"ABC",50000);//no upcasting
        e1.disp();//static binding- compile time polymorphism
        e1.calSalary();

        System.out.println("******************");
        TechEmp1 te1=new TechEmp1(123,"ABC",50000,10000);//no upcasting
        te1.disp();//static binding- compile time polymorphism
        te1.calSalary();
        System.err.println("******************");
        e=te1;//upcasting- parent class reference variable can refer to child class object
        e.disp();//overriden- RTP
        e.calSalary();//overriden- RTP
    }
    

}