package ex1.polygons;

public class Polygon {
    private Point[] vertices;

    public Polygon(int numVertices) {
        this.vertices = new Point[numVertices];
    }

    public void setVertex(int position, Point p) {
        vertices[position] = p;
    }

    public float getPerimeter() {
        float perimeter = 0;

        for (int i = 0; i < vertices.length - 1; i++) {
            perimeter += vertices[i].getDistance(vertices[i + 1]);
        }

        perimeter += vertices[0].getDistance(vertices[vertices.length - 1]);
        return perimeter;
    }
}
