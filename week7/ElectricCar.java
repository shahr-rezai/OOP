package week7;

public class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargeLevel;

    public ElectricCar(String make, String model, String color, double price, double batteryCapacity, double chargeLevel) {
        super(make, model, color, price);
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public void chargeBattery(double amount) {
        chargeLevel = Math.min(100, chargeLevel + amount);
        System.out.println("Battery charged by " + amount + "%. Current charge: " + chargeLevel + "%");
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Electric Car Details ---");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charge Level: " + chargeLevel + "%");
    }

    public void calculateRange() {
        double range = (batteryCapacity * chargeLevel / 100) * 5;
        System.out.println("Updated Range: " + range + " km");
    }
}
