

public class Collections23{
    int id;
    String name;
    double gpa;
    String city;
    String university;

    public Collections23(int id, String name, double gpa, String city, String university){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.city=city;
        this.university=university;
    }

    @Override
    public String toString(){
        return "ID: "+ id +
                    "\tName: " + name +
                    "\tGPA: "  + gpa +
                    "\tCity: " + city +
                    "\tUniversity: "+ university + "\n";    
    }
    
}