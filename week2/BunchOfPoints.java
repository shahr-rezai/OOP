class BunchOfPoints {
    Point[] points;

    // Constructor
    BunchOfPoints(int n) {
        points = new Point[n];

        // Initialize all points to (0,0)
        for (int i = 0; i < n; i++) {
            points[i] = new Point(0, 0);
        }
    }

    // Return the ith Point
    Point getPoint(int i) {
        return this.points[i];
    }

    // Change x and y of the ith Point
    void setPoint(int i, double newX, double newY) {
        this.points[i].x = newX;
        this.points[i].y = newY;
    }

    // Count points with squared-distance > given value
    int numberFurtherThan(double squaredDistance) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            double distSq = points[i].x * points[i].x + points[i].y * points[i].y;
            if (distSq > squaredDistance) {
                count++;
            }
        }
        return count;
    }
}
