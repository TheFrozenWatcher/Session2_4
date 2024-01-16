package Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static Exercise.StudentManagement.studentCrud;

public class Ex5 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------Menu--------------");
            System.out.println("1. Show all students");
            System.out.println("2. Add new students");
            System.out.println("3. Edit students");
            System.out.println("4. Delete students");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thi
                    studentCrud.showAllStudent();
                    break;
                case 2:
                    studentCrud.addNewStudent(sc);
                    break;
                case 3:
                    studentCrud.updateStudent(sc);
                    break;
                case 4:
                    studentCrud.deleteStudent(sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error choice");
            }
        }
    }
    StudentManagement studentManagement = new StudentManagement();

    // Creating an instance of Student
    StudentManagement.Student s1 = studentManagement.new Student();

    // Input data from the keyboard
    s1.inputData();

    // Display the entered values
    s1.displayData();
}

class StudentManagement {
    public static StudentCrud studentCrud = new StudentCrud();

    class Student {
        private String id;
        private String name;
        private Date birthday;
        private boolean sex;
        private String address;
        private String phoneNumber;

        public Student() {
        }

//    public Student(String id, String name, Date birthday, boolean sex, String address, String phoneNumber) {
//        this.id = id;
//        this.name = name;
//        this.birthday = birthday;
//        this.sex = sex;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void inputData(Scanner sc) throws ParseException {
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat simf = new SimpleDateFormat(pattern);
            if (id == null) {
                // thêm mới
                System.out.println("Nhập id : ");
                this.id = sc.nextLine();
            }
            System.out.println("Nhập name : ");
            this.name = sc.nextLine();
            System.out.println("Nhập ngày sinh : ");
            // chuyển đổi từ String => Date
            this.birthday = simf.parse(sc.nextLine());
            System.out.println("Nhập gen : ");
            this.sex = Boolean.parseBoolean(sc.nextLine());
            System.out.println("Nhập address : ");
            this.address = sc.nextLine();
            System.out.println("Nhập phoneNumber : ");
            this.phoneNumber = sc.nextLine();
        }

        public void displayData() {
            System.out.println("Student{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", birthday=" + birthday +
                    ", sex=" + (sex ? "Nam" : "Nữ") +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}');
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", birthday=" + birthday +
                    ", sex=" + (sex ? "Nam" : "Nữ") +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }

    class StudentCrud {
        public static Student[] students = new Student[0];

        public void addNewStudent(Scanner sc) throws ParseException {
            // Nhập số lượng cần thêm
            System.out.println("Nhạp số lượng câ thêm");
            int n = Integer.parseInt(sc.nextLine());
            // tạo mảng mới và copy giá trị cũ sang
            Student[] newStudents = new Student[students.length + n];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            for (int i = 0; i < n; i++) {
                Student newStudent = new Student();
                newStudent.inputData(sc);
                newStudents[students.length + i] = newStudent;
            }

            students = newStudents;
        }

        public void showAllStudent() {
            if (students.length == 0) {
                System.err.println("Danh sách rỗng");
            } else {
                System.out.println("Danh sách học sinh");
                for (int i = 0; i < students.length; i++) {
                    students[i].displayData();
                }
            }
        }

        public void updateStudent(Scanner sc) throws ParseException {
            // Nhập id cần sửa
            System.out.println("Nhaap id cần edit :");
            String id = sc.nextLine();
            int indexById = findIndexById(id);
            if (indexById != -1) {
                // bắt nhập thông tin mới
//            Student editStudent = students[indexById];
//            editStudent.inputData(sc);
                System.out.println("Thông tin cũ");
                System.out.println(students[indexById]);
                System.out.println("Nhập thông tin mới");
                students[indexById].inputData(sc);
                System.out.println("Cập nhạt thanh cong");
            } else {
                System.err.println("id khong tim thay");
            }
        }

        public void deleteStudent(Scanner sc) {
            // Nhập id cần xóa
            System.out.println("Nhaap id cần xoa :");
            String id = sc.nextLine();
            int indexById = findIndexById(id);
            if (indexById != -1) {
                Student[] newStudent = new Student[students.length - 1];
                for (int i = 0; i < newStudent.length; i++) {
                    if (i < indexById) {
                        newStudent[i] = students[i];
                    } else if (i > indexById) {
                        newStudent[i - 1] = students[i];
                    }
                }
                students = newStudent;
                System.out.println("Xóa thành công");
            } else {
                System.err.println("id khong tim thay");
            }
        }

        public int findIndexById(String id) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId().equals(id)) {
                    return i;
                }
            }
            return -1;
        }

    }
}