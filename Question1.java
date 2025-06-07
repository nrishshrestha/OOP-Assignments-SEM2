class Vehicle {
    void drive() {
        System.out.println("Vehicle is begin driven.");
    }
}
class Car extends Vehicle {
    void display() {
        System.out.println("Car details: Brand - Toyota, Model - Crown, Year - 1898.");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.display();
    }
}
