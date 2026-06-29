class Teacher{
    String name;
    Teacher(String name){
        this.name=name;
    }
}

class Student{
    String name;
    Student(String name){
        this.name=name;
    }

    void teacherName(Teacher T){

        System.out.println("The faculty name of "+name+" is "+T.name);
    }
}

public class Association{
    public static void main(String[] args){
        Teacher t1 = new Teacher("Neha");
        Student s1 = new Student("Vatsal");

        s1.teacherName(t1);
    }
}