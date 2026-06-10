//Employee
public class TreeSet24{
    private int eid;
    private String empName;
    private double salary;

    public TreeSet24(int eid, String empName, double salary){
        this.eid=eid;
        this.empName=empName;
        this.salary=salary;

    }

    public String toString(){
        return eid+" "+empName+" "+salary;
    }

    public String getEmpName(){
        return empName;
    }
    public double getSalary(){
        return salary;
    }

}