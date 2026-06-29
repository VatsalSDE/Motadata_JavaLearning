class Engine {
    void start() {
        System.out.println("Engine starts...");
    }
}

class Car {
    private Engine engine; // Composition

    Car() {
        engine = new Engine(); // Engine created inside Car
        System.out.println("Here inside the car new engine is made");
    }

    void startCar() {
        engine.start();
        System.out.println("Car is moving...");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.startCar();
    }    
}