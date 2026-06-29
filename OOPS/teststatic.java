public class teststatic {

    static int a;

    teststatic(){
        a=5;
    }
    
    void increase(){
        a++;
    }

    public static void main(String[] args) {
        teststatic t1 = new teststatic();

        t1.increase();
        t1.increase();

        
        System.out.println(a); // here this will print 7 

        teststatic t2 = new teststatic();

        System.out.println(a); // her ethis will print 5 becaus ejust now object created so for that reason 
    }
}
