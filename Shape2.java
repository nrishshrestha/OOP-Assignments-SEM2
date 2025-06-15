import java.util.Scanner;

abstract class Shape {
    void calculateArea(){
        System.out.println("Area calculation");
    }
    void calculatePerimeter(){
        System.out.println("Perimeter calculation");
    }
}

class Rectangle2 extends Shape {
    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Area= " + (l * b));
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Perimeter = " + (2 * (l + b)));
    }
}

class Circle2 extends Shape {
    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        float area = (float) (3.14 * r * r);
        System.out.println("Area = " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        float perimeter = (float) (2 * 3.14 * r);
        System.out.println("Perimeter = " + perimeter);
    }
}

class Triangle2 extends Shape {
    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        float b = sc.nextFloat();
        System.out.println("Enter height:");
        float h = sc.nextFloat();
        float area = (b * h) / 2;
        System.out.println("Area = " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        float a = sc.nextFloat();
        System.out.println("Enter side 2:");
        float b = sc.nextFloat();
        System.out.println("Enter side 3:");
        float c = sc.nextFloat();
        float perimeter = a + b + c;
        System.out.println("Perimeter = " + perimeter);
    }
}

class ImplementShape2{
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2();
        Circle2 circ = new Circle2();
        Triangle2 tri = new Triangle2();

        System.out.println("Rectangle:");
        rect.calculateArea();
        rect.calculatePerimeter();

        System.out.println("\nCircle:");
        circ.calculateArea();
        circ.calculatePerimeter();

        System.out.println("\nTriangle:");
        tri.calculateArea();
        tri.calculatePerimeter();
    }
}