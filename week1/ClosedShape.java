public class ClosedShape{
  private int X;
  private int Y;

  public ClosedShape()
  {
    this(0,0);
  }
  public ClosedShape(int X, int Y)
  {
    this.X=X;
    this.Y=Y;
  }

  public int getX(){
    return X;
  }
  public void setX(int x){
    X=x;
  }
  public int getY(){
    return Y;
  }
  public void setY(int y){
    Y=y;
  }

  public double getArea(){
    return 0;
  }

  public double getPerimeter(){
    return 0;
  }
  @Override
  public String toString(){
    return "ClosedShape [X="+ X +", Y="+ Y +"]";
  }
}
