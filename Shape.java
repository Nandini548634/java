// Parent Class
class BaseShape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child Class 1
class Circle extends BaseShape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area (Radius = " + radius + "): " + area);
    }
}

// Child Class 2
class Rectangle extends BaseShape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

// Main Class (Matches shape.java)
public class shape {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.display();
        c.calculateArea();

        System.out.println();

        Rectangle r = new Rectangle(4.0, 6.0);
        r.display();
        r.calculateArea();
    }
}
