class chain{
    int id;
    String name;

    chain(){
        System.out.println("Here chain is there");
    }

    chain(int i){
        id=i;
    }

    chain(int i , String n){
        this(i);  // so here we have applied the constructor chaining ok so yeahh like that 
        name=n;
    }
}

class c extends chain{
    c(){ // so this will explicity call like the chain() default okk so yeah like that 
        // so here first like the here chain is there will be printed 
        System.out.println("Here c and check if super there");
    }
}

public class chaining {
    public static void main(String[] args) {
        c c1= new c();
    }
}
