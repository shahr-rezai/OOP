package week2;
public class ShapeTest1{
  public static void main(String [] args){
    ClosedShape1[] shapes = new ClosedShape1[4];
    shapes[0] = new ClosedShape1(1,2);
    shapes[1] = new Rectangle1(2, 3, 3,3);
    shapes[2] =  new Circle1(1, 2, 3);
  }
  
  for (ClosedShape1 s: shapes){
    System.out.println(s);
    System.out.println("Area: "+ s.getArea());
    System.out.println("Paremiter: " + s.getPerimeter());
    System.out.println();}

  }
