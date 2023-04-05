package fan_class;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeedFast();
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        fan2.setSpeedMedium();
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setStatus(false);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
