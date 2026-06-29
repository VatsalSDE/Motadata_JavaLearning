public class ExceptionHandling {

    public static void riskyMethod(int[] arr, int index) {
        try {
            int result = arr[index] / arr[index - 1];
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Division by zero occurred");
        }
    }
    
    public static void main(String[] args) {
        try {
        int result = 10 / 0;
        System.out.println(result);
        } catch (ArithmeticException e) {
        System.out.println("Exception or error in this " + e.getClass());
        }

        System.out.println("The code runs with try catch block");
        
        // so here we will check like the array index out of bound
        int[] arr = { 1, 2, 3 };
        riskyMethod(arr, 5);

        // try {
        //     int x = 10 / 0;
        // } catch (Exception e) {
        //     System.out.println("General");
        // } catch (ArithmeticException e) { // this gives compile time error
        //     System.out.println("Arithmetic");
        // }
    }
}
