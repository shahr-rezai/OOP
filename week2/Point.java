public class Point {
    double x;
    double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

 
    public boolean isUpperHalfPlane() {
        return y >= 0;
    }
    public boolean inFirstQuadrant() {
        return x > 0 && y > 0;
    }


    public boolean isInQuadrant(int quadrantNumber) {
        if (quadrantNumber == 1) {
            return x > 0 && y > 0;
        } else if (quadrantNumber == 2) {
            return x < 0 && y > 0;
        } else if (quadrantNumber == 3) {
            return x < 0 && y < 0;
        } else if (quadrantNumber == 4) {
            return x > 0 && y < 0;
        } else {
            return false; // invalid quadrant number
        }
    }

    
    public double squaredDistance() {
        return x * x + y * y;
    }

   
    @Override
    public String toString() {
        return "Point(x = " + x + ", y = " + y + ")";
    }
}
