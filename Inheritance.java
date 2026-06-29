class Employee{
    String name;
    String Department;
    int ID;

    void work(){
        System.out.println("The employees are working");
    }
}

class Developer extends Employee{

    void code(){
        System.out.println("The developers are coding");
    }

    Developer(String name, String Department , int id){
        this.name=name;
        this.Department=Department;
        this.ID=id;
    }

    void printDetails(){
        System.out.println("The Developer details are ");
        System.out.println("Name:- "+name);
        System.out.println("Department:- "+Department);
        System.out.println("ID:- "+ID);
    }
}

class QA extends Employee{

    void work(){
        System.out.println("The QA are testing");
    }

    QA(String name, String Department , int id){
        this.name=name;
        this.Department=Department;
        this.ID=id;
    }
    void printDetails(){
        System.out.println("The QA details are ");
        System.out.println("Name:- "+name);
        System.out.println("Department:- "+Department);
        System.out.println("ID:- "+ID);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Developer d1= new Developer("Vatsal","OBOps",1);
        QA q1 = new QA("Purvish", "OBops", 2);

        d1.printDetails();
        q1.printDetails();
    }
}