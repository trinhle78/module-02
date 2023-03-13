package moveable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }
    public String toString() {
        return super.toString() + ", speed = ("
                + this.xSpeed + ", "
                + this.ySpeed + ")";
    }
    public MovablePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }
}
