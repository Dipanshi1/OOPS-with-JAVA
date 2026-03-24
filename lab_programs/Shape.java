class Shapes {
    void area() {
        System.out.println("Calculating area...");
    }
}
class Circle extends Shapes {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        System.out.println("Calculating area of a circle with radius " + radius);
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }
}
class Rectangle extends Shapes {
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    void area() {
        System.out.println("Calculating area of a rectangle with width " + width + " and height " + height);
        double area = width * height;
        System.out.println("Area: " + area);
    }
}
public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.area();
    }
}
