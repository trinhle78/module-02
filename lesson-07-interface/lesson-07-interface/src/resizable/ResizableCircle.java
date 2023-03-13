package resizable;

import interface_comparable.Circle;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        double newRadius = getRadius() * (1 + (double)percent / 100);
        setRadius(newRadius);
    }
}
