import java.io.IOException;

public class Exceptionthrowandthrows {

    public static void checkage(int age) throws IOException{
    if (age < 0 || age > 150) {
        throw new IOException("Age must be between 0 and 150, got: " + age);
    }
    else {
        System.out.println("OKK");
     }
    }
    public static void main(String[] args) {

        try{
            checkage(-8);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
