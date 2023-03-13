package resizable;

import interface_comparable.Rectangle;

public class ResizableRectangle extends Rectangle implements Resizable {
    public ResizableRectangle(double width, double length) {
        super(width, length);
    }
    @Override
    public void resize(int percent) {
        setWidth(getWidth() * (1 + percent / 100));
        setLength(getLength() * (1 + percent / 100));
    }

}
