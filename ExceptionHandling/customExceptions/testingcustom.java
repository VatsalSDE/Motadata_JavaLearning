package customExceptions;

public class testingcustom {

    public static void validateAge(int age) throws AgeInvalidException{

        if(age<18) throw new AgeInvalidException("The Age is invalid");

    }

    public static void validBalalnce(double balance) throws negativebalance{
        if(balance < 1000) throw new negativebalance("The balance is not sufficient");
    }
    public static void main(String[] args) {
        // try{
        //     validateAge(15);
        // }
        // catch(AgeInvalidException e){
        //     System.out.println(e);
        // }

        // validateAge(10); // this is not valid because it is a checked exception so must be there in the try catch block

        // now if it is a unchecked exception so we can like directly use it okk so yeahh 

        validBalalnce(500);
    }
}
