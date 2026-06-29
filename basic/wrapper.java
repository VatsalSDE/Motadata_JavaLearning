package Basic;
public class wrapper {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // TRUE — cached, same object

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);
    }
}
