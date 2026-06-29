import java.sql.Date;

final class Student {
    private final String name;
    private final java.util.Date dob;

    public Student(String name, java.util.Date dob) {
        this.name = name;
        this.dob = new java.util.Date(dob.getTime()); // deep copy
    }

    public String getName() { return name; }

    public java.util.Date getDob() {
        return new java.util.Date(dob.getTime()); // return copy
    }
}

class Main{
    public static void main(String[] args) {
        Date d1 = new Date(0);
        Student s1 = new Student("Vatsal", d1);

        System.out.println(s1.getName());
        System.out.println(s1.getDob());
    }
}