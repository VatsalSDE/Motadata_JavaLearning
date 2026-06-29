package Exception;

public class invalidAge extends Exception {
    public invalidAge(String message){
        super(message); //so here we have given to the top most levl super message likewise 
    }
    
    public void checkAge(int age) throws invalidAge{
        if(age<18){
            throw new invalidAge("Age invalid");
        }
    }
}
