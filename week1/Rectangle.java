public class Rectangle extends ClosedShape {
    private double myWidth;
    private double myHeight;

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(double width, double height) {
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.myWidth = width;
        this.myHeight = height;
    }

    public double getWidth() {
        return myWidth;
    }

    public double getHeight() {
        return myHeight;
    }

    public double getArea() {
        return myWidth * myHeight;
    }

    public double getPerimeter() {
        return 2 * (myWidth + myHeight);
    }

    @Override
    public String toString() {
        return super.toString() + " Width: " + myWidth + ", Height: " + myHeight;
    }
}
