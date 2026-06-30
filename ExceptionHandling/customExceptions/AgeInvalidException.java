package customExceptions;


// so here this is the custom exception here
public class AgeInvalidException extends Exception{
    public AgeInvalidException(String message){
        super(message);
    }
}
