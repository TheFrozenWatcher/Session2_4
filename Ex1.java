package Exercise;

import java.util.Scanner;


public class Ex1 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Khởi tạo đối tượng Circle
        Circle circle1 = new Circle();
        circle1.inputData(); // Nhập thông tin từ người dùng
        circle1.displayData(); // Hiển thị thông tin

    }


}

class Circle {
    Scanner scanner = new Scanner(System.in);

    // Thuộc tính
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        // Constructor không tham số
    }

    public Circle(double radius, String color) {
        // Constructor có tham số
        this.radius = radius;
        this.color = color;
    }

    // Getter và setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính chu vi
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double area() {
        return Math.PI * radius * radius;
    }

    // Phương thức nhập thông tin từ người dùng
    public void inputData() {
        System.out.print("Nhập bán kính: ");
        this.radius = scanner.nextDouble();

        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập màu sắc: ");
        this.color = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + perimeter());
        System.out.println("Diện tích: " + area());
    }
}