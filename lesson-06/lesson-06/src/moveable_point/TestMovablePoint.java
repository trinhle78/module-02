package moveable_point;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(2,2);
        System.out.println(point1);
        point1 = point1.move();
        System.out.println(point1);
    }
}
