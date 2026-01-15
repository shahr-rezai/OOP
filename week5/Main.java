abstract class Animal {
  String name;
  abstract void makeSound();
  public void eat(){
    System.out.println("Eating");
  }
  public void sleep(){
    System.out.println("Sleeping");
  }
  
}

interface AnimalBehavior{
  public void move();
  public void makeSound();
}


class Lion extends Animal implements AnimalBehavior{
  @Override
  public void makeSound(){
    System.out.println("Lions sound");
  }
  @Override
  public void move(){
    System.out.println("Moving");
  } 

  public void roar(){
    System.out.println("Lion is roaring");
  }
  
}

class Elephant extends Animal implements AnimalBehavior{
  @Override
  public void makeSound(){
    System.out.println("Elephant sound");
  }
  @Override
  public void move(){
    System.out.println("Moving");
  }

  public void trumpet(){
    System.out.println("Elephant trumpet");
  }
  
}

class Bird extends Animal implements AnimalBehavior{
  @Override
  public void makeSound(){
    System.out.println("Birds sound");
  }
  @Override
  public void move(){
    System.out.println("Moving");
  }
  public void fly(){
    System.out.println("Birds fly");
  }
  

  
}

public class Main{
  public static void main(String[] args) {
    Animal[] animals = {new Lion(), new Elephant(), new Bird()};
    for (Animal a : animals){
      a.makeSound();
      a.eat();
      a.sleep();
      System.out.println("------");
    }

    Lion lion = new Lion();
    lion.roar();

    Elephant elephant = new Elephant();
    elephant.trumpet();

    Bird bird = new Bird();
    bird.fly();
  }
}