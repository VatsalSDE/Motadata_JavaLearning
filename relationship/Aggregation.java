class Department {
    String name;
    Department(String name) { this.name = name; }
}

class Teacher {
    String name;
    Department department; // Aggregation

    Teacher(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    void showInfo() {
        System.out.println(name + " belongs to " + department.name + " department.");
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department dt = new Department("Observe-Ops");

        // so here both the teachers are at the different but like are in the same department
        Teacher t1 = new Teacher("Vatsal", dt);
        Teacher t2= new Teacher("Purvish", dt);

        t1.showInfo();
        t2.showInfo();
    }
}
