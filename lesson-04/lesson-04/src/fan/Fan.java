package fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public String getSpeed() {
        String s = "";
        switch (this.speed) {
            case SLOW:  s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return this.on;
    }
    public void turnOn() {
        this.on = true;
    }
    public void turnOff() {
        this.on = false;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        if (this.on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color +
                    ", radius: " + radius + "\n";
        } else {
            return "\nFan color: " + color + ", radius: " + radius +
                    "\nfan is off\n";
        }
    }
}
