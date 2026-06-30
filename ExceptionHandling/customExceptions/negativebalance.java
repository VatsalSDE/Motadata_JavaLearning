package customExceptions;

public class negativebalance extends RuntimeException{
    public  negativebalance(String Message){
        super(Message);
    }
}
