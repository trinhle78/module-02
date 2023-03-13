package resizable;

import interface_comparable.Square;

public class ResizableSquare extends Square implements Resizable{
    public ResizableSquare(double side) {
        super(side);
    }
    @Override
    public void resize(int percent) {
        setSide(getSide() * (1 + percent / 100));
    }
}
