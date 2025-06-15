abstract class Vehicle {
    void startEngine(){
        System.out.println("Engine starts.");
    }
    void stopEngine(){
        System.out.println("Engine stops.");
    }
}

class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Car engine starts");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stops");
    }
    
}

class Motorcycle extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stops");
    }

}

class ImpleemntVehicle{
    public static void main(String[] args) {
        Car c1=new Car();
        Motorcycle m1=new Motorcycle();
        c1.startEngine();
        c1.stopEngine();
        m1.startEngine();
        m1.stopEngine();
    }
}