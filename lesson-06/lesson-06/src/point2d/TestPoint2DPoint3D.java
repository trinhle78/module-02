package point2d;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);

        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a.getX());
        System.out.println(p2a.getY());
        p2b.setXY(6,7);
        System.out.println(p2b.getXY());

        /* Test Point3D*/
        Point3D p3a = new Point3D(11, 12, 13);
        System.out.println(p3a);
        Point2D p3b = new Point3D();
        System.out.println(p3b);
        p3a.setXYZ(7,8,9);
        float[] arr = p3a.getXYZ();
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}
