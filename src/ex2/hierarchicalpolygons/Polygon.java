package ex2.hierarchicalpolygons;

import ex1.polygons.Point;

public abstract class Polygon {

    public abstract float getPerimeter();

//    public void printPerimeters(Polygon[] polygons) {
    public static void printPerimeters(Polygon[] polygons) {
        for (Polygon p: polygons) {
            if (p == null)
                return;
            System.out.println(p.getPerimeter());
        }
    }

    public static void main(String[] args) {
        Polygon[] ps = new Polygon[3];

        ps[0] = new Triangle(3, 4, 5);
        ps[1] = new Rectangle(2.5f, 4.5f);
        ps[2] = new Square(6.0f);

        Polygon.printPerimeters(ps);
    }

}
