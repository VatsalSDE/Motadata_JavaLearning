public class test {

    test(){
        System.out.println("constructor");
    }
    static{
        System.out.println("static");
    }

    {
        System.out.println("simple");
    }

    public static void main(String[] args) {
        test t1 = new test();
        // for this the instance block was printed but if i don't create the object so the instance block is not printed     
    }
}
