package week2;
public class Circle1 extends ClosedShape1{
  private double myRadius;

  public Circle1(){
    this(0, 0, 0);
  }
  public Circle1(double myRadius){
    this(0, 0, myRadius);
  }
  public Circle1(int X, int Y, double myRadius){
    super(X, Y);
    this.myRadius=myRadius;
  }
  public double getMyRadius(){
    return myRadius;
  }
  public void setMyradius(double myRadius){
    this.myRadius=myRadius;

  }
  public double getArea(){
    return Math.PI *myRadius*myRadius;
  }
  public double getPerimeter(){
    return 2*Math.PI*myRadius;
  }
  @Override
  public String toString(){
    return super.toString() + "radius: " +myRadius;
  }
}