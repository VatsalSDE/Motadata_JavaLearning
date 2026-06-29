class CCar {
    String color;
    int speed;

    public CCar() { // Default
        this.color = "White";
        this.speed = 0;
    }

    public CCar(String c) { // Single parameter
        this.color = c;
        this.speed = 50;
    }

    public CCar(String c, int s) { // Two parameters
        this.color = c;
        this.speed = s;
    }

    void display() {
        System.out.println(color + " car at " + speed + " km/h");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        // default
        CCar c1 = new CCar("red");
        System.out.println(c1.color); // this will print white 
    }
}
