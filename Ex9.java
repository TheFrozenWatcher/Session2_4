package Exercise;

import Exercise.Ex9.TestCircle;

public class Ex9 {
    public static void main(String[] args) {
        TestCircle newCircle= new TestCircle();
    }

    static class TestCircle {
        Circle testCircle = new Circle();
        double radius = testCircle.getRadius();
        double area = testCircle.getArea();

        public TestCircle() {
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + area);
        }
    }

    static class Circle {
        private double radius = 1;
        private String color = "red";

        public Circle() {
        }
        public Circle(double radius) {
            this.radius = radius;
        }

        //Getter
        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }
//        Setter


        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea() {
            return Math.pow(radius, 2) * Math.PI;
        }
    }
}

