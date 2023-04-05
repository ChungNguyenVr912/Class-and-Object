package fan_class;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "red";

    public Fan() {
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeedLow() {
        this.speed = this.SLOW;
    }

    public void setSpeedMedium() {
        this.speed = this.MEDIUM;
    }

    public void setSpeedFast() {
        this.speed = this.FAST;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(boolean status) {
        this.on = status;
    }
    @Override
    public String toString(){
        if(this.on == true){
            return this.color + " radius: " + this.radius + " speed: " + this.speed + " fan is on";
        }else {
            return this.color + " radius: " + this.radius + " fan is off";
        }
    }
}
