package ra.validate;

import ra.presentation.StudentApplication;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentValidator {
    public static String validateStudentId(Scanner scanner, String message, String regex) {
        System.out.println(message);
        do {
            String inputString = scanner.nextLine();
            if (Pattern.matches(regex, inputString)) {
                return inputString;
            }
            System.err.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
        } while (true);
    }

    public static String isStudentExist(Scanner scanner, String value, String type) {
        do {
            boolean isExist = false;
            if (type.equals("studentId")) {
                for (int i = 0; i < StudentApplication.currentStudentIndex; i++) {
                    if (StudentApplication.arrStudent[i].getStudentId().equals(value)) {
                        isExist = true;
                        break;
                    }
                }
            }
            if (!isExist) {
                return value;
            }
            System.err.println("Dữ liệu bị trùng lặp, vui lòng nhập lại");
            value = scanner.nextLine();
        } while (true);

    }
}
