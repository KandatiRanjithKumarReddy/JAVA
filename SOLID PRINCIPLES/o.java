// 2. Open/Closed Principle (OCP)
// Definition:
// A class should be open for extension but closed for modification.

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class o {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape c = new Circle(5);

        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Circle Area: " + c.calculateArea());
    }
}