public class Person{
  String name;
  int age;
  String address;

  Person(String name, int age, String address){
    this.name=name;
    this.age=age;
    this.address=address;

  }
  void introduce(){
    System.out.println("Hi, I am " +name+ "I am"+ age+ "years old , and i live in "+address+ ".");
  }
}