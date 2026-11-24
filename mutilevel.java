
class Shape {
    void showShape() {
        System.out.println("Level 1: This is a Shape.");
    }
}

  
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateCircleArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Level 2: Circle Area = " + area);
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Level 3: Cylinder Volume = " + volume);
    }
}

public class mutilevel {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5.0, 10.0);

        cyl.showShape();           
        cyl.calculateCircleArea(); 
        cyl.calculateVolume();     
    }
}

