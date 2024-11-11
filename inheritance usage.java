class Vehicle {
    String make;
    String model;
    int year;
    String fuel_type;

    // Constructor
    public Vehicle(String make, String model, int year, String fuel_type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    }

    // Methods to be overridden in subclasses.
    public double calcFuelEfficiency() {
        return 0;
    }

    public double calcDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calcFuelEfficiency();
    }

    public double calculateMaxSpeed() {
        return 0;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuel_type) {
        super(make, model, year, fuel_type);
    }

    @Override
    public double calcFuelEfficiency() {
        return 8; // km per liter
    }

    @Override
    public double calculateMaxSpeed() {
        return 130; // km per hour
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuel_type) {
        super(make, model, year, fuel_type);
    }

    @Override
    public double calcFuelEfficiency() {
        return 15; // km per liter
    }

    @Override
    public double calculateMaxSpeed() {
        return 180; // km per hour
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuel_type) {
        super(make, model, year, fuel_type);
    }

    @Override
    public double calcFuelEfficiency() {
        return 35; // km per liter
    }

    @Override
    public double calculateMaxSpeed() {
        return 220; // km per hour
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Ford", "F-150", 2021, "Diesel");
        Vehicle car = new Car("Toyota", "Camry", 2020, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2019, "Petrol");

        System.out.println("Truck Fuel Efficiency: " + truck.calcFuelEfficiency() + " km/l");
        System.out.println("Truck Max Speed: " + truck.calculateMaxSpeed() + " km/h");
        System.out.println("Truck Distance Traveled: " + truck.calcDistanceTraveled(10) + " km");

        System.out.println("Car Fuel Efficiency: " + car.calcFuelEfficiency() + " km/l");
        System.out.println("Car Max Speed: " + car.calculateMaxSpeed() + " km/h");
        System.out.println("Car Distance Traveled: " + car.calcDistanceTraveled(10) + " km");

        System.out.println("Motorcycle Fuel Efficiency: " + motorcycle.calcFuelEfficiency() + " km/l");
        System.out.println("Motorcycle Max Speed: " + motorcycle.calculateMaxSpeed() + " km/h");
        System.out.println("Motorcycle Distance Traveled: " + motorcycle.calcDistanceTraveled(10) + " km");
    }
}
