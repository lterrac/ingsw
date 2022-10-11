package ex2.hierarchicalpolygons;

public class Triangle extends Polygon{

    private final float l1, l2, l3;

    public Triangle(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public float getPerimeter() {
        return l1 + l2 + l3;
    }
}
