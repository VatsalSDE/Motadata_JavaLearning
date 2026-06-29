public class Calculator {

    static int operationcount=0;

    private String calculatorName;

   public Calculator(String name){
        this.calculatorName=name;
    }

    // here we have done the method overloading
    
    public  int add(int n1 , int n2){
        operationcount++;
        return n1 + n2;
    }

    public  int add(int n1 , int n2 , int n3){
        operationcount++;
        return n1 + n2 + n3;
    }

    public double add(double n1 , double n2){
        operationcount++;
        return n1+n2;
    }

    public void getStats(){
        System.out.println("The name if the calc is "+calculatorName);
        System.out.println("The total number of operations done are "+operationcount);
    }
    public static void main(String[] args) {
        Calculator c1= new Calculator("Casio");
        Calculator c2= new Calculator("Ocean");

        c1.add(2,3);
        c1.add(3,4,5);
        c1.add(3.7, 4.5);

        c1.getStats();
    }
}