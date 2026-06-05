public class Student{
    int sid;
    String sname;
    double gpa;
    static String university;

    static{//static block to initialize static variable--executed during class loading
        university="IIT";
        System.out.println("Static block executed before main method");
    }

    void setStudent(int id, String name, double avg){
        sid=id;
        sname=name;
        gpa=avg;
    }

    void getStudent(){
        System.out.println(sid+" "+sname+" "+gpa+" "+university);
    }
    public static void change(){
        university="MIT";
    }
}