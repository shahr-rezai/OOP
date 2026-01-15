public class PointTest {
    public static void main(String[] args) {
        
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-2, 5);
        Point p3 = new Point(-3, -4);
        Point p4 = new Point(6, -7);

        // Test methods
        System.out.println(p1); // uses toString()
        System.out.println("Is in upper half-plane? " + p1.isUpperHalfPlane());
        System.out.println("Is in first quadrant? " + p1.inFirstQuadrant());
        System.out.println("Is in quadrant 3? " + p1.isInQuadrant(3));
        System.out.println("Squared distance from origin: " + p1.squaredDistance());

        System.out.println("\n" + p3);
        System.out.println("Is in quadrant 3? " + p3.isInQuadrant(3));
    }
}
