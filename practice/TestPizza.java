import java.util.Scanner;

public class TestPizza {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Toppings[] baseToppings = { Toppings.BBQChicken, Toppings.BeefMince};
        Pizza pizza = new Pizza(300.0, baseToppings);  

        while (true) {
            System.out.println("\n=== Pizza Menu ===");
            System.out.println("1. Add extra topping");
            System.out.println("2. View total price");
            System.out.println("3. Apply discount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Available Toppings:");
                    for (Toppings t : Toppings.values()) {
                        System.out.println("- " + t + " (Tk " + t.getPrice() + ")");
                    }
                    System.out.print("Enter topping name to add (e.g., PEPPERONI): ");
                    String toppingName = sc.nextLine();
                    boolean found = false;
                    for (Toppings t : Toppings.values()) {
                        if (t.name().equals(toppingName)) {
                            pizza.addToppings(t);
                            System.out.println(t + " added.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid topping name.");
                    }
                    break;

                case 2:
                    double total = pizza.calculatePrice();
                    System.out.println("Total price: Tk " + total);
                    break;

                case 3:
                    System.out.println("1. Percentage discount");
                    System.out.println("2. Fixed taka discount");
                    System.out.print("Choose discount type: ");
                    int discType = sc.nextInt();

                    if (discType == 1) {
                        System.out.print("Enter discount rate (e.g., 0.1 for 10%): ");
                        double rate = sc.nextDouble();
                        pizza.applyDiscount(rate);
                        System.out.println("Discount applied.");
                    } else if (discType == 2) {
                        System.out.print("Enter discount amount (in Taka): ");
                        int taka = sc.nextInt();
                        pizza.applyDiscount(taka);
                        System.out.println("Discount applied.");
                    } else {
                        System.out.println("Invalid discount type.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}