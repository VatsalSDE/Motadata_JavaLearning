import java.util.Arrays;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address; // reference type field — this is where shallow vs deep matters

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class copy {
    public static void main(String[] args) {
        Address a1 = new Address("Vadodara");
        Person p1 = new Person("vatsal", a1);

        // this is the shallow copy
        Person p2 = new Person(p1.name, p1.address);

        p2.address.city = "ahmedabad";

        // the main also changes because of that
        System.out.println(p1.address.city);

        // now the deep copy
        Person p3 = new Person(p1.name, new Address(p1.address.city)); // creates a BRAND NEW Address

        p3.address.city = "Mumbai";
        System.out.println(p1.address.city); // still "Surat" — p1 completely unaffected

        // p1 ──▶ Person { name:"Vatsal", address ──▶ Address { city:"Surat" } }

        // p3 ──▶ Person { name:"Vatsal", address ──▶ Address { city:"Mumbai" } }
        // (completely separate object)

        // 
        System.out.println("Testing the shallow and deep copy in the array");
        int[] arr = {1,2,3,4};
        // int[] scopy=arr;
        // scopy[3]=0;

        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // int[]

        // now like the deep copy
        int[] dcopy=Arrays.copyOf(arr, 4);
        dcopy[3]=0;

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

}
