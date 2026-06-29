package Basic;
public class Recursion {

    public static int power(int x , int pow){
        if(pow==0) return 1;

        return x * power(x, pow-1);
    }
    public static void main(String[] args) {
        int ans=power(2, 3);
        System.out.println("The answer is "+ans);
    }
}
