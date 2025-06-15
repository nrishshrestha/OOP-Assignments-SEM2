import java.util.Scanner;

abstract class Shape{
    void calculateArea(){
        System.out.println("Area to be calculated");
    }
}

class Rectangle extends Shape{
    @Override
    void calculateArea() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=sc.nextInt();
        System.out.println("Enter Breadth:");
        int b=sc.nextInt();
        System.out.println("Area="+l*b);
    }
}

class Circle extends Shape{

    @Override
    void calculateArea() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int r=sc.nextInt();
        float area=(float) (3.14*r*r);
        System.out.println("Area="+area);
    }
    
}

class ImplementShape{
    public static void main(String[] args) {
        Rectangle R1=new Rectangle();
        Circle C1=new Circle();
        R1.calculateArea();
        C1.calculateArea();
    }
}