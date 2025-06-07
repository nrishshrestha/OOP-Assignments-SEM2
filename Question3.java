class Shape {
    double area;
}
class Rectangle extends Shape {
    void calculateArea(double length, double width) {
        area = length * width;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Square extends Shape {
    void calculateArea(double lengths) {
        area = lengths * lengths;
        System.out.println("Area of Square:"+area);
    }
}

class Circle extends Shape {
    void calculateArea(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: "+area);
    }
}
public class Question3 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.calculateArea(5);
        Rectangle r = new Rectangle();
        r.calculateArea(2, 4);
        Circle c = new Circle();
        c.calculateArea(2);
    }    
}
