class TestBunchOfPoints {
    public static void main(String[] args) {
        BunchOfPoints bunch = new BunchOfPoints(10);

        bunch.setPoint(0, 0.5, -12.0);
        bunch.setPoint(1, 5.5, 12.0);
        bunch.setPoint(2, 2.5, -12.0);
        bunch.setPoint(3, 6.5, 12.0);
        bunch.setPoint(4, -10.5, -7.0);
        bunch.setPoint(5, -9.3, 1.9);
        bunch.setPoint(6, 0.5, -4.3);
        bunch.setPoint(7, 2.5, 13.0);
        bunch.setPoint(8, 5.5, -12.0);

        System.out.println(bunch.numberFurtherThan(160.0));
       
    }
}
