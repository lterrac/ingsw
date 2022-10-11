package ex2.hierarchicalpolygons;

public class Rectangle extends Polygon{

    private final float l1, l2;

    public Rectangle(float l1, float l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
    @Override
    public float getPerimeter() {
        return 2 * (l1 + l2);
    }
}
