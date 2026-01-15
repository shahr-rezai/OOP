package week7;

import java.util.ArrayList;

// Base Car class (assuming your previous fixed Car class is in the same package)

public class CarManagementSystem {

    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Corolla", "Blue", 25000);
        toyota.displayDetails();
        toyota.accelerate(30);
        toyota.displaySpeed();
        toyota.brake(10);
        toyota.displaySpeed();

        toyota.setMileage(12000);
        toyota.setFuelEfficiency(15); // fixed typo

        System.out.println(toyota.serviceRequired());
        toyota.calculateRange(10);

        toyota.calculateTotalCost(5000, 800, 24);
        toyota.calculateInsurance(200, 6);

        toyota.addFeature("Sunroof");
        toyota.addFeature("Bluetooth", "Rear Camera", "Heated Seats");
        toyota.displayFeatures();

        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", "Red", 55000, 75, 80);
        tesla.displayDetails();
        tesla.chargeBattery(10);
        tesla.calculateRange();

        FuelCar honda = new FuelCar("Honda", "Civic", "White", 28000, 50);
        honda.displayDetails();
        honda.refuel(30);
        honda.calculateRange(18);

        CarDealership dealership = new CarDealership();
        dealership.addCar(toyota);
        dealership.addCar(tesla);
        dealership.addCar(honda);
        dealership.listInventory();
    }
}

// ElectricCar subclass
class ElectricCar extends Car {
    private double batteryLevel; // in kWh
    private double maxRange;     // in km

    public ElectricCar(String make, String model, String color, double price, double batteryLevel, double maxRange) {
        super(make, model, color, price);
        this.batteryLevel = batteryLevel;
        this.maxRange = maxRange;
    }

    public void chargeBattery(double amount) {
        batteryLevel += amount;
        System.out.println("Battery charged by " + amount + " kWh. Current level: " + batteryLevel + " kWh");
    }

    public void calculateRange() {
        double range = (batteryLevel / maxRange) * 100; // simple example
        System.out.println("ElectricCar range: " + range + " km");
    }
}

// FuelCar subclass
class FuelCar extends Car {
    private double fuelLevel; // in liters

    public FuelCar(String make, String model, String color, double price, double fuelLevel) {
        super(make, model, color, price);
        this.fuelLevel = fuelLevel;
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Fuel added: " + amount + " liters. Current fuel: " + fuelLevel + " liters");
    }

    public void calculateRange(double fuelEfficiency) {
        double range = fuelLevel * fuelEfficiency;
        System.out.println("FuelCar range: " + range + " km");
    }
}

// CarDealership class
class CarDealership {
    private ArrayList<Car> inventory = new ArrayList<>();

    public void addCar(Car car) {
        inventory.add(car);
        System.out.println(car.getMake() + " added to dealership.");
    }

    public void listInventory() {
        System.out.println("--- Dealership Inventory ---");
        for (Car car : inventory) {
            System.out.println(car.getMake() + " " + car.getModel() + " (" + car.getColor() + ") - $" + car.getPrice());
        }
    }
}
