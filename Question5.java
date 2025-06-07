class Shape {
    double area;
    void calculateArea() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    void calculateArea() {
        area  = length * width;
        System.out.println("Area of Rectangle:"+area);
    }
    void calculatePerimeter() {
        double perimeter = 2 * (length+width);
        System.out.println("Perimeter of Rectangle: "+perimeter);
    }
}

class Circle extends Shape {
    double radius;
    final double PI = 3.1416;
    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        area = PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * PI * radius;
        System.out.println("Circle Circumference: " + circumference);
    }
    
}

public class Question5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        rect.calculateArea();
        rect.calculatePerimeter();

        System.out.println();

        Circle circle = new Circle(4);
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
