

class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding.");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startEngine();
        car1.stopEngine();
        car1.drive();
        System.out.println();
        Motorcycle mc = new Motorcycle();
        mc.startEngine();
        mc.stopEngine();
        mc.ride();
    }
}
