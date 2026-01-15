package practice;
public class VideoGamePractice{
  String name;
  double price;

  VideoGamePractice(String name, double price){
    this.name=name;
    this.price=price;
  }
  void startGame(){
    System.out.println("The game "+ this.name+"has started.");

  }
  void stopGame(){
    System.out.println("The game "+ this.name+"has stoped.");
  }
  void playGame(){
    System.out.println("Playing the game "+ this.name+ " .");
  }
}