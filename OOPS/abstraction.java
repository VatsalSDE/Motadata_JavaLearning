abstract class shape{
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public shape(String color){
        
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor(){
        
        return color;
        
    }
}

class Circle extends shape{
    private double radius;

    Circle(String color , double radius){
        super(color);
        this.radius=radius;
    }

    double area(){
        return 3.14*radius*radius;
    }

    @Override 
    public String toString(){
        
        return "Circle color is " + super.getColor()
            + "and area is : " + area();
    }
}

class Rectangle extends shape{

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override 
    double area() { return length * width; }

    @Override 
    public String toString()
    {
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}

public class abstraction {
    public static void main(String[] args) {
        shape s1=new Circle("red",5);
        shape s2 = new Rectangle("Yellow", 2, 4);
        double ans=s1.area();
        System.out.println("The area of the circle is "+ans);

        System.out.println(s2.toString());
    }
}
