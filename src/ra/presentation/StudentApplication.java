package ra.presentation;

import ra.bussiness.StudentBusiness;
import ra.entity.Student;
import ra.validate.validator;

import java.util.Scanner;

public class StudentApplication {
    public static final Student[] arrStudent = new Student[100];
    public static int currentStudentIndex = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayStudentsMenu(scanner);
    }

    public static void displayStudentsMenu(Scanner scanner) {
        do {
            System.out.println("********************Student Menu*********************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp ");
            System.out.println("0. Thoát chương trình ");
            int choine = validator.validateInputInt(scanner, "Lựa chọn của bạn: ");
            switch (choine) {
                case 1:
                    StudentBusiness.displayListStudent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!!!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1->6");
            }
        }while (true);
    }
}
