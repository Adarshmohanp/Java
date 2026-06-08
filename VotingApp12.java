//used defined exception handling

public class VotingApp12{
    public void validate(int age)throws InvalidAge12{//throws-declaring
        if(age<18){
            throw new InvalidAge12("Not valid to vote");//throw-explicitly
        }
        else{
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String args[]){
        //caller should handle the exception
        VotingApp12 app = new VotingApp12();
       try{
            app.validate(23);
            app.validate(17);
        }
        catch(InvalidAge12 e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally is always executed");
        }

        System.out.println("rest of the code...");
        
    }
}
