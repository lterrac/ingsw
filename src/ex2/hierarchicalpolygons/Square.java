package ex2.hierarchicalpolygons;

public class Square extends Polygon {
    private final float lato;

    public Square(float lato) {
        this.lato = lato;
    }

    @Override
    public float getPerimeter() {
        return (4 * lato);
    }

}
