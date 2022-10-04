package ex1.polygons;

public class TestDrive {
    public static void main(String[] args) {
        Point p0 = new Point();

        System.out.println(p0);

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,1);
        Point p3 = new Point(2,2);
        Point p4 = new Point(1,2);

        System.out.println(p1.getDistance(p2));

        Polygon p = new Polygon(4);
        p.setVertex(0, p1);
        p.setVertex(1, p2);
        p.setVertex(2, p3);
        p.setVertex(3, p4);

        System.out.println(p.getPerimeter());
    }
}
