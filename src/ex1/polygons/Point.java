package ex1.polygons;

public class Point {
    private final float x;
    private final float y;

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public double getDistance(Point p) {
        double dx = Math.pow(x - p.x, 2);
        double dy = Math.pow(y - p.y, 2);
        return Math.sqrt(dx + dy);
    }
}
