public interface InterfaceAnonymous8 {
    void eat();
    void speak();

    public static void main(String args[]){
        InterfaceAnonymous8 p=new InterfaceAnonymous8(){//anonymous class
            public void eat(){
                System.out.println("Eating...");
            }
            public void speak(){
                System.out.println("English");
            }
        };
        p.eat();
        p.speak();
    }
}