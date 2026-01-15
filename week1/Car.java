public class Car{
  String make;
  String model;
  int year;
  String color;

  Car(String make, String model, int year, String color){
    this.make=make;
    this.model=model;
    this.year=year;
    this.color=color;
  }
  void startCar(){
    System.out.println("The " + make + " " + model + " is starting...");
  }
  
  @Override
public String toString() {
    return "Car Details: " +
           "Make=" + make +
           ", Model=" + model +
           ", Year=" + year +
           ", Color=" + color;
}

}