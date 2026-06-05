public class StudentTest{// main class which drives the student application

    public static void main(String args[]){
        Student s1=new Student();
        s1.setStudent(123,"ABC",8.9);
        s1.getStudent();

        Student.change();

        Student s2=new Student();
        s2.setStudent(456,"PQR",9.5);
        s2.getStudent();
    }

}