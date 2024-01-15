package Thuchanh;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        double a= input.nextDouble();
        System.out.println("Nhập b");
        double b= input.nextDouble();
        Calculator calculator= new Calculator();
        calculator.setA(a);
        calculator.setB(b);
        double sum= calculator.add(());
        double sub=calculator.sub(());
        double multi = calculator.multi(());
        double div=calculator.div(());
    }
    public class Calculator {
        double a;
        double b;
        public Calculator (){}
        public Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public double setA(double a) {
            return a;
        }

        public double getB() {
            return b;
        }

        public double setB(double b) {
            return a;
        }

        public double add() {
            return a + b;
        }

        public double sub() {
            return a - b;
        }

        public double multi() {
            return a * b;
        }

        public double div() {
            return a / b;
        }
    }
}

