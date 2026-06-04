public class Student{
    int sid;
    String sname;
    double gpa;
    static String university="Standford";

    void setStudent(int id, String name, double avg){
        sid=id;
        sname=name;
        gpa=avg;
    }

    void getStudent(){
        System.out.println(sid+" "+sname+" "+gpa);
    }

}