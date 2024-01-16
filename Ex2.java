package Exercise;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.inputData();
        quadraticEquation.displayData();
    }
}

class QuadraticEquation {
    Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;
    private double c;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation() {
    }
    ;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    ;

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }


    public double getRoot1() {
        double delta = getDiscriminant();

        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public void inputData() {
        System.out.print("Nhập số a: ");
        this.a = scanner.nextDouble();
        System.out.print("\nNhập số b: ");
        this.b = scanner.nextDouble();
        System.out.print("\nNhập số c: ");
        this.c = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Phương trình: "+ a+"x^2 +"+b+"x + "+c+" =0");
        double delta = getDiscriminant();
        double r1 = getRoot1();
        double r2 = getRoot2();
        if (delta > 0) {
            System.out.println("Hai nghiệm là " + r1 + " và " + r2);
        } else if (delta == 0) {
            System.out.println("Nghiệm là " + r1);
        } else {
            System.out.println("Vô nghiệm");
        }
    }
}