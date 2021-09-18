abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class Rectangle extends Shape {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {

        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length);
        System.out.print("Resulting area: " + rectangle.area());
        System.out.print("\nResulting perimeter: " + rectangle.perimeter() + "\n");

        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("\nCircle radius: " + radius);
        System.out.print("Resulting Area: " + circle.area());
        System.out.print("\nResulting Perimeter: " + circle.perimeter() + "\n");

    }
}
