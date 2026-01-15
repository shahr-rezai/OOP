public class Circle extends ClosedShape {
    private double myRadius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(double myRadius) {
        this(0, 0, myRadius);
    }

    public Circle(int x, int y, double myRadius) {
        super(x, y);
        this.myRadius = myRadius;
    }

    public double getRadius() {
        return myRadius;
    }

    public void setRadius(double radius) {
        this.myRadius = radius;
    }

    public double getArea() {
        return Math.PI * myRadius * myRadius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * myRadius;
    }

    @Override
    public String toString() {
        return super.toString() + " radius: " + myRadius;
    }
}
