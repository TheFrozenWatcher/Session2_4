package Exercise;

public class Ex8 {
    public static void main(String[] args){
        System.out.println("Diện tích hình tròn có bán kính 3.5 là "+ StaticMethod.calCircleArea(3.5));
        System.out.println("Diện tích hình tròn có bán kính 6 là "+StaticMethod.calCircleArea(6));
        System.out.println("Diện tích tam giác có các cạnh là (3, 4, 5) là "+StaticMethod.calTriangleArea(3,4,5));
        System.out.println("Diện tích tam giác có các cạnh là (4.5, 7, 6) là "+StaticMethod.calTriangleArea(4.5,7,6));
        System.out.println("Diện tích hình chữ nhật có các cạnh là (2.5, 6) là "+StaticMethod.calRectangleArea(2.5,6));
        System.out.println("Diện tích hình chữ nhật có các cạnh là (4, 7) là "+StaticMethod.calRectangleArea(4,7));

    }
}

class StaticMethod{
    static double PI=3.14;
    double R;
    static double calCircleArea(double R){
        return Math.pow(R,2)*PI;
    };
    double width;
    double height;
    static double calRectangleArea(double width,double height){
        return width*height;
    }
    double a;
    double b;
    double c;
    static double calTriangleArea(double a, double b, double c){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}