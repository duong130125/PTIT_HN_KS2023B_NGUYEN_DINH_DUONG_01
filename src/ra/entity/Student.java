package ra.entity;

import ra.presentation.StudentApplication;
import ra.validate.StudentValidator;

import java.util.Scanner;

public class Student implements IApp {
    private String studentId;
    private String studentName ;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private String email;
    private String major;
    private String className;
    private float gpa;
    private byte status = 1;

    public Student() {
    }

    public Student(String studentId, String studentName, String birthday, String phoneNumber, boolean sex, String email, String major, String className, float gpa, byte status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.email = email;
        this.major = major;
        this.className = className;
        this.gpa = gpa;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        if (StudentApplication.currentStudentIndex == 0) {
            System.err.println("Chưa có sinh viên tồn tại, vui lòng thêm mới sinh viên trước");
            return;
        }

        this.studentId = inputStudentId(scanner);

        System.out.println("Nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh của sinh viên: ");
        this.birthday = scanner.nextLine();

        System.out.println("Nhập số điện thoại của sinh viên: ");
        this.phoneNumber = scanner.nextLine();

        System.out.println("Nhập giới tính của sinh viên: ");
        this.sex = scanner.nextBoolean();

        System.out.println("Nhập vào địa chỉ email của sinh viên: ");
        this.email = scanner.nextLine();

        System.out.println("Nhập vào ngành học của sinh viên: ");
        this.major = scanner.nextLine();

        System.out.println("Nhập vào tên lớp của sinh viên: ");
        this.className = scanner.nextLine();

        System.out.println("Nhập vào điểm tích lũy trung bình của sinh viên: ");
        this.gpa = scanner.nextFloat();

        System.out.println("Nhập trạng thái sản phẩm (1: Đang theo học, 2: Bảo lưu, 3: Đã nghỉ học): ");
    }

    public String inputStudentId(Scanner scanner) {
        String studentId = StudentValidator.validateStudentId(scanner, "Nhập vào mã sinh viên", "[SV]\\w{5}");
        return StudentValidator.isStudentExist(scanner, studentId, "studentId");
    }


    @Override
    public void displayData() {
        System.out.println("Mã Sinh viên: " + this.studentId);
        System.out.println("Tên Sinh viên: " + this.studentName);
        System.out.println("Tuổi: " + this.birthday);
        System.out.println("Giới tính: " + (this.sex ? "Nam" : "Nữ"));
        System.out.println("Số điện thoại: " + this.phoneNumber);
        System.out.println("Tên lớp: " + this.className);
        System.out.println("Trạng thái: " + this.status);
    }
}
