
//Person
public abstract class AnonymousClass7{
    abstract void eat();

    public void speak(){
        System.out.println("English");
    }

    public static void main(String args[]){
        AnonymousClass7 p=new AnonymousClass7(){//anonymous class
            void eat(){
                System.out.println("Eating...");
            }
            @Override
            public void speak(){
                System.out.println("Hindi");
            }
        };
        p.eat();
        p.speak();
    }
    //the anonymours class for this class can be created in another class also
}