package week7;
import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private String color;
    private double price;
    private double speed;
    private double speedLimit = 200;
    private double mileage;
    private double fuelEfficiency;  // fixed variable name
    private ArrayList<String> customFeatures = new ArrayList<>();

    public Car(String make, String model, String color, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("--- Car Details ---");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }

    public void accelerate(double amount) {
        if (speed + amount > speedLimit) {
            speed = speedLimit;
            System.out.println("Speed limit reached! Current speed: " + speed + " km/h");
        } else {
            speed += amount;
            System.out.println(make + " speed increased by " + amount + " km/h.");
        }
    }

    public void accelerate() {
        accelerate(10);
    }

    public void brake(double amount) {
        speed = Math.max(0, speed - amount);
        System.out.println(make + " speed decreased by " + amount + " km/h.");
    }

    public void brake() {
        brake(5);
    }

    public void displaySpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }

    public String serviceRequired() {
        return mileage > 10000 ? "service required" : "service not required";
    }

    public void calculateRange(double fuelAmount) {
        double range = fuelAmount * fuelEfficiency;
        System.out.println("Range: " + range + " km");
    }

    public void calculateTotalCost(double downPayment, double monthlyPayment, int months) {
        double totalCost = downPayment + (monthlyPayment * months);
        System.out.println("Total Cost: $" + totalCost);
    }

    public void calculateInsurance(double baseRate, int carAge) {
        double cost = baseRate;
        if (carAge > 5) {
            cost *= 0.9;
        }
        System.out.println("Insurance Cost: $" + cost);
    }

    public void addFeature(String feature) {
        customFeatures.add(feature);
        System.out.println("Added feature: " + feature);
    }

    public void addFeature(String... features) {
        for (String f : features) {
            customFeatures.add(f);
        }
        System.out.println("Added multiple features: " + String.join(", ", features));
    }

    public void displayFeatures() {
        System.out.println("Custom Features: " + customFeatures);
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public double getSpeed() { return speed; }

    public void setSpeedLimit(double speedLimit) {
        if (speedLimit >= 0 && speedLimit <= 200) {
            this.speedLimit = speedLimit;
            System.out.println("Speed limit set to " + speedLimit + " km/h.");
        } else {
            System.out.println("Invalid speed limit! Must be between 0 and 200.");
        }
    }
}
