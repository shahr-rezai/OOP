public class shapeTest {
    public static void main(String[] args) {

        ClosedShape[] shapes = new ClosedShape[4];
        shapes[0] = new ClosedShape(1, 2);
        shapes[1] = new Rectangle(2, 3, 4, 5);
        shapes[2] = new Circle(4, 5, 10);
        shapes[3] = new Square(6, 7, 8);

        for (ClosedShape s : shapes) {
            System.out.println(s);
            System.out.println("Area: " + s.getArea());
            System.out.println("Perimeter: " + s.getPerimeter());
            System.out.println();
        }
    }
}
