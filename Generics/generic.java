package Generics;

import java.util.ArrayList;

class test <T>{
    T obj;  // T used as a variable type 

    test(T ob){ // T used as the constructor args
        this.obj=ob;
    }

    public T getobj(){  // t used as the method return type 
        return obj;
    }
}
public class generic {
    public static void main(String[] args) {
        test<Integer> t1 = new test<Integer>(15);
        System.out.println(t1.getobj());

        test<String> t2 = new test<String>("HEllo");
        System.out.println(t2.getobj());

//         Generics enforce type safety at compile time.
// By specifying the type (e.g., ArrayList<String>), only that type of object can be added.
// This prevents invalid data insertion and avoids runtime errors. 
    }
}
