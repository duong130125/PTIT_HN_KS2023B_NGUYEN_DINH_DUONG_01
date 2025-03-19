package ra.validate;

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
}
