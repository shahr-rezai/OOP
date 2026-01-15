package week7;
import java.util.ArrayList;

public class CarDealership {
    private ArrayList<Car> inventory = new ArrayList<>();

    public void addCar(Car car) {
        inventory.add(car);
    }

    public void listInventory() {
        System.out.println("\n--- Dealership Inventory ---");
        int i = 1;
        for (Car c : inventory) {
            System.out.println(i++ + ". " + c.getMake() + " " + c.getModel() + " - " + c.getColor() + " - $" + c.getPrice());
        }
    }
}
