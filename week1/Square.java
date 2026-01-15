public class Square extends Rectangle {
    public Square() {
        this(0, 0, 0);
    }

    public Square(double side) {
        this(0, 0, side);
    }

    public Square(int x, int y, double side) {
        super(x, y, side, side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return super.toString() + " (square)";
    }
}
