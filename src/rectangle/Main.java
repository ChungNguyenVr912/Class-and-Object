package rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 50);
        System.out.println(rect.display());
        System.out.print("Rect area: " + rect.getArea());
        System.out.println();
        System.out.print("Rect perimeter: " + rect.getPerimeter());
    }
}
