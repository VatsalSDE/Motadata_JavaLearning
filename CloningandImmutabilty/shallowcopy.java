class Addresss {
    String city;

    Addresss(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int id;
    String name;
    Addresss address;

    Student(int id, String name, Addresss address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class shallowcopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Addresss addr = new Addresss("Delhi");
        Student s1 = new Student(101, "Aman", addr);
        Student s2 = (Student) s1.clone();

        s2.address.city = "Mumbai"; // change city in cloned object

        System.out.println(s1.address.city); // also changes to Mumbai
    }
}
