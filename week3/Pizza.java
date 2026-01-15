enum Toppings {
    BBQChicken(129),
    BeefMince(129),
    BeefPepperoni(129);

    double cost;

    Toppings(double cost) {
        this.cost = cost;
    }

    double getPrice() {
        return this.cost;
    }
}

public class Pizza {
    final double BASE_PRICE;
    final Toppings[] includedToppings;

    private Toppings[] extraToppings; 
    private int extraCount; 

    private double discountRate = 0.0;

    public Pizza(double BASE_PRICE, Toppings[] includedToppings) {
        this.BASE_PRICE = BASE_PRICE;
        this.includedToppings = includedToppings;
        this.extraToppings = new Toppings[10];
        this.extraCount = 0;
    }

    void addToppings(Toppings topping) {
        if (extraCount < extraToppings.length) {
            extraToppings[extraCount] = topping;
            extraCount++;
        } else {
            System.out.println("Cannot add more toppings. Maximum reached.");
        }
    }

    double calculatePrice() {
        double price = BASE_PRICE;
        for (int i = 0; i < extraCount; i++) {
            price += extraToppings[i].getPrice();
        }
        price -= discountRate;
        return price;
    }

    void applyDiscount(double discountRate) {
        this.discountRate = BASE_PRICE * discountRate;
    }

    void applyDiscount(int takaDiscount) {
        this.discountRate = takaDiscount;
    }
}