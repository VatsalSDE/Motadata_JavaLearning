@FunctionalInterface
interface add{
    int sum(int a , int b);

    default void show(){
        System.out.println("Hello i am default ");
    }
}

public class FunInter {
    public static void main(String[] args) {

        // this is the lambda expression for the like the interface add and here this eliminates the annonymous class creations and all 

        add a =(b,x) -> b+x;

        int ans = a.sum(9, 7);

        a.show(); // this will be printed 
        System.out.println(ans);
    }
}
