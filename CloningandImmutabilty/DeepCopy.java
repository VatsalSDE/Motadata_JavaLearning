class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Studentt implements Cloneable {
    int id;
    String name;
    Address address;

    Studentt(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Studentt s = (Studentt) super.clone();
        s.address = new Address(address.city); // create new Address object
        return s;
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Delhi");
        Studentt s1 = new Studentt(101, "Aman", addr);
        Studentt s2 = (Studentt) s1.clone();

        s2.address.city = "Mumbai";

        System.out.println("Original: " + s1.address.city);
        System.out.println("Clone: " + s2.address.city);

        String s ="vatsal";
        s.set
    }
}
