package week2;
public class Rectangle1 extends ClosedShape1{
  private double myWidth;
  private double myHeight;

  public Rectangle1(){
    this(0, 0, 0, 0);
  }

  public Rectangle1(double myWidth, double myHeight){
    this(0, 0, myWidth, myHeight);
  }

  public Rectangle1(int X, int Y, double myWidth, double myHeight) {
        super(X, Y);
        this.myWidth = myWidth;
        this.myHeight = myHeight;
    }

  public double getWidth(){
    return myWidth;
  }
  public double getHeight(){
    return myHeight;
  }
  public double getArea(){
    return myWidth*myHeight;
  }

  public double getPerimeter(){
    return 2* (myWidth+myHeight);
  }
  @Override
  public String toString(){
    return super.toString()+ " Width: " + myWidth + ", Height: " + myHeight;
  }
}