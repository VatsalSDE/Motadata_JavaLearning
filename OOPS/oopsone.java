class Vehicle{
    private String companyName;
    private String model;
    private String gear;
    private int price;
    private String colour;

    Vehicle(String cname , String mod , String gr , int p , String clr){
        this.companyName=cname;
        this.model=mod;
        this.gear=gr;
        this.price=p;
        this.colour=clr;
    }

    public void getDetails(){
        System.out.println("The company details are :- ");
        System.out.println("Company Name :- "+companyName);
        System.out.println("The model of the car is "+model);
        System.out.println("The type of gear :- "+gear);
        System.out.println("The price of the car :- "+price);
        System.out.println("The colour of the car is :- "+colour);
    }
}

class Car extends Vehicle{
    public Car(String cname , String mod , String gr , int p , String clr){
        super(cname,mod,gr,p,clr);
    } // here telling to compulsarily have to call like the super okk so yeah like that now
}
public class oopsone{
    public static void main(String[] args) {
        
    }
}