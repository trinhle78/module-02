package resizable;

import interface_comparable.Shape;

public class ResizableGeometricTest {
    public static void main(String[] args) {
//        Shape[] shape = new Shape[3];
//        shape[0] = new ResizableCircle(4);
//        shape[1] = new ResizableRectangle(5,8);
//        shape[2] = new ResizableSquare(6);
        Shape circle = new ResizableCircle(4);
        System.out.println(circle);
        double percentIncrease = Math.floor(Math.random() * 100);
        ((ResizableCircle) circle).resize(50);
        System.out.println(((ResizableCircle) circle).getRadius());
    }

}
