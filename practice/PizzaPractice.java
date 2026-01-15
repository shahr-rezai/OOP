enum Toppings{
  BBQChicken(129),
  BeefMince(129),
  BeefPepperoni(129);

  double cost;
  Toppings(double cost){
    this.cost=cost;
  }
  double getPrice(){
    return this.cost;
  }


}
public class PizzaPractice {
  final double BASE_PRICE;
  final Toppings[] includeToppings;
  private Toppings[] extraToppings;
  private int extraCount;
  private double discountRate = 0.0;

  PizzaPractice(double BASE_PRICE, Toppings[] includeToppings){
    this.BASE_PRICE=BASE_PRICE;
    this.includeToppings=includeToppings;
    
    this.extraToppings= new Toppings[10];
    this.extraCount=0;
      
  }

  void addTopping(Toppings topping){
    if(extraCount<extraToppings.length){
      extraToppings[extraCount]=topping;
      extraCount++;
    }
    else{
      System.out.println("Can not add more Toppings the max is reached! ");
    }
  }
  double calculatePrice(){
    double price = BASE_PRICE;
    for(int i=0; i<extraCount; i++){
      price += extraToppings[i].getPrice();
    }
    price -= discountRate;
    return price;
  }
  void displayDiscount(double discountRate){
    this.discountRate=BASE_PRICE*discountRate;
  }
}
