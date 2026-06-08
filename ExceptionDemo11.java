import java.util.*;

public class ExceptionDemo11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=0,b=0;
        //enforcing exception handling
        try{
            a=sc.nextInt();//chance for InputMismatchException
            b=sc.nextInt();

            int c=a/b;
            System.out.println("Division is: " + c);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            //or we can use System.err.println("Cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        //catch(Exception e){
        //    System.out.println(e);
        //} we can also use this, as it is parent of all exceptions and parent class reference can hold child class object, but it is not recommended as it will catch all exceptions and we may miss some specific exceptions

        int sum=a+b;
        System.out.println("Sum is: " + sum);

        int prod=a*b;
        System.out.println("Product is: " + prod);

        System.out.println("End of program");
        
    }
}