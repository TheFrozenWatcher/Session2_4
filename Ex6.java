package Exercise;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employees.EmployeeCrud employeeCrud=new Employees.EmployeeCrud();
        employeeCrud.addNewEmployees();
        employeeCrud.displayEmployees();
    }
}

class Employees {
    Scanner input = new Scanner(System.in);
    //    Khởi tạo thuộc tính
    String employeeId;
    String employeeName;
    boolean gender;
    double rate;
    double salary;

    public Employees() {
    }
    public Employees(String employeeId, String employeeName, boolean gender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    //Getter
    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public boolean getGender() {
        return gender;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return salary;
    }
//Setter

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calSalary(double rate) {
        return rate * 1300000;
    }

    //    Input data
    public void InputData() {
        System.out.println("Nhập id: ");
        this.employeeId = input.next();
        System.out.println("Nhập tên: ");
        this.employeeName = input.next();
        System.out.println("Nhập giới tính: ");
        this.gender = input.nextBoolean();
        System.out.println("Nhập hệ số lương: ");
        this.rate = input.nextDouble();
        this.salary = calSalary(this.rate);
    }

    public void DisplayData() {
        System.out.println("Employee{ id='" + employeeId + '\'' +
                ", name='" + employeeName + '\'' +
                ", gender='" + (gender? "Nam":"Nữ")+ '\'' +
                ", rate='" + rate + '\'' +
                ", salary='" + salary + '\'' +
                '}');

    }

    @Override
    public String toString() {
        return "Employee{ id='" + employeeId + '\'' +
                ", name='" + employeeName + '\'' +
                ", gender='" + (gender? "Nam":"Nữ") + '\'' +
                ", rate='" + rate + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    static class EmployeeCrud {
        public static Employees[] employees = new Employees[5];

        public static void addNewEmployees() {
            for (int i = 0; i < 5; i++) {
                Employees newEmployee = new Employees();
                newEmployee.InputData();
                employees[i] = newEmployee;
            }
        }

        public static void displayEmployees() {
            System.out.println("Danh sách nhân viên: ");
            for (int i = 0; i < 5; i++) {
                employees[i].DisplayData();
            }
        }
    }
}

