package colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(2,3);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Square) {
                System.out.println("Square at element " + i);
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
