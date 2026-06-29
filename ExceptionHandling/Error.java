public class Error {

    public static int recursive(int n){
        if(n==1) return 1;
        return recursive(n-1);
    }
    public static void main(String[] args) {
        int age =15;
        
        try {
            if(age < 18){
            throw new ArithmeticException("Exception");
          }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        
    }
}
