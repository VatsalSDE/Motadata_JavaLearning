import java.io.IOException;

public class thorwandthrows {

    static void catc() throws IOException{  // so here we can also liek us ein the throws any exceptuoion but liek it should be there in the like the
        // throw new IOException("There is the error");
        throw null;
    }
    public static void main(String[] args) {
        // int age =15;
        // if(age<18){

        //     // so the throw is for the like the for the subclasses of the throwable and then the like the and we can just do give our own exceptions also so yeah like wise that
        // throw new ArithmeticException("This is to just check the throw kwyword");
        // }
        // else{
        //     System.out.println("Hello so we are here ");
        // }

        try{
            catc();
        }
        catch(Exception e){
            System.out.println(e); // only the exception statement is being just printed okk so yeah like that now 
        }
    }
}