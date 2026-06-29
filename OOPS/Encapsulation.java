class Student{
    private String name;
    private int id;
    public static int count=0;

    Student(String n , int i){
        name=n;
        id=i;
        count++;
    }

    public void getDetails(){
        System.out.println("The name of the student is "+name);
        System.out.println("The ID of the student is "+id);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        if(id>0){
        this.id=id;
        }
        else{
            System.out.println("The id is invalid");
        }
    }

    public void setBoth(String name , int id){
        setName(name);
        setId(id);
    }
}
public class Encapsulation {
    public static void main(String[] args) {

        Student s1 =new Student("Vatsal", 1);
        Student s2=new Student("Purvish", 2);

        s1.getDetails();
        s2.getDetails();

        System.out.println("The totalnumber of students is "+Student.count);
    }
}