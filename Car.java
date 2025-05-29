public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay >= 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean rentCar() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 60.0);
        System.out.println("Car available: " + car.isAvailable());
        boolean rented = car.rentCar();
        System.out.println("Renting car: " + (rented ? "Success" : "Already rented"));
        System.out.println("Car available after renting: " + car.isAvailable());
        car.returnCar();
        System.out.println("Car available after returning: " + car.isAvailable());
    }
}
