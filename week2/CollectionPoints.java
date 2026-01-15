public class CollectionPoints {
  public static void main(String args[]){
    Point[] points = new Point[3];
    for(int i=0; i<=points.length; i++){
      points[i]=new Point(i+1, i+1);
    }
    for (int i=0; i<point.length; i++){
      System.out.println("(" + points[i].x + ", " + points[i].y + ")");
    }
  }
}
