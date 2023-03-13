package circle_cylinder;

import com.sun.source.tree.UsesTree;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public String toString() {
        return "Circle { radius = " + this.radius
                + ", color = '" + color + "'}";
    }
}
