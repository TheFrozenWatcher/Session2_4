package Exercise;

public class Ex7 {
    public static void main(String[] args) {
        MyClass newString = new MyClass();
        // Hiển thị giá trị thuộc tính myString của đối tượng vừa tạo
        System.out.println(newString.getMyString());
        newString.setMyString("1234");
        System.out.println(newString.getMyString());
    }
}

class MyClass {
    private String myString;

    //    Constructor không tham số
    public MyClass() {
        this.myString = "myString";
    }

    ;

    //        Constructor có tham số
    public MyClass(String myString) {
        this.myString = myString;
    }

    //        Getter
    public String getMyString() {
        return myString;
    }

    //        Setter
    public void setMyString(String myString) {
        this.myString = myString;
    }
}