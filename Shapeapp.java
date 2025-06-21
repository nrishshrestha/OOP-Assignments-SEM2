abstract class Shape {
    abstract double AreaCalculation();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    double AreaCalculation() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double AreaCalculation() {
        return length  * breadth;
    }
}

class Triangle extends Shape {
    double length;
    double height;
    Triangle (double length, double height) {
        this.length = length;
        this.height = height;
    }

    double AreaCalculation() {
        return (1/2) * length * height;
    }
}

public class Shapeapp {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(2,3),
            new Triangle(2,6)
        };
        for (Shape s : shapes) {
            System.out.println("Area: "+s.AreaCalculation());
        }
    }
}
