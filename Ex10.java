package Exercise10;

public class Ex10 {

}

class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

//    public Student(String name, String classes){
//        this.name=name;
//        this.classes=classes;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

class Test {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("ABC");
        student1.setClasses("C10");
    }
}