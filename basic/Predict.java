package Basic;
public class Predict {
    static int x = 5;

    public static void modify(int x) {
        x = 100;
        System.out.println("Inside method: " + x);
    }
    
    public static void main(String[] args) {
        modify(x);
        System.out.println("After method: " + x);

        StringBuilder sb = new StringBuilder("Java");
        changeIt(sb);
        System.out.println("After changeIt: " + sb);
    }

    public static void changeIt(StringBuilder sb) {
        sb.append(" Rocks");
    }
}