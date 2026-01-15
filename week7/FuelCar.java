package week7;

public class FuelCar extends Car {
    private double fuelTankCapacity;
    private double currentFuel = 0;

    public FuelCar(String make, String model, String color, double price, double fuelTankCapacity) {
        super(make, model, color, price);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel(double amount) {
        if (currentFuel + amount <= fuelTankCapacity) {
            currentFuel += amount;
            System.out.println("Refueled " + amount + "L successfully.");
        } else {
            System.out.println("Cannot refuel beyond tank capacity!");
        }
    }

    public void calculateRange(double fuelEfficiency) {
        double range = currentFuel * fuelEfficiency;
        System.out.println("Range: " + range + " km");
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Fuel Car Details ---");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " L");
    }
}
