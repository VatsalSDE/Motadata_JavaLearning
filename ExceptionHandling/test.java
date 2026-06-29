public class test {


static void fun() {
        throw new RuntimeException("Runtime");
    }

    public static void main(String[] args) {

        try {
            fun();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("B");
        }

        System.out.println("C");
    }
}
