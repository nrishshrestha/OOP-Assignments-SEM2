abstract class Vehicle {
    abstract double RentalCalculation(int days);
}

class Car extends Vehicle {
    double RentalCalculation(int days) {
        return days * 100;
    }
}

class Motorcycle extends Vehicle {
    double RentalCalculation(int days) {
        return days * 70;
    }
}

class Bicycles extends Vehicle {
    double RentalCalculation(int days) {
        return days * 60;
    }
}

public class Rentalsystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Bicycles()
        };
        int days = 3;
        for (Vehicle v: vehicles) {
            System.out.println("Cost: " +v.RentalCalculation(days));
        }
    }
}
