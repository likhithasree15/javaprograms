import java.util.Scanner;
class Shape {
    public int getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    public int width;
    public int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        Rectangle myRectangle = new Rectangle(width, height);
        System.out.println("Area of the rectangle: " + myRectangle.getArea());
        scanner.close();
    }
}
