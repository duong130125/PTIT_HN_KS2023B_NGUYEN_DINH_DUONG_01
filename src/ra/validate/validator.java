package ra.validate;

import java.util.Scanner;

public class validator {
    public static int validateInputInt(Scanner scanner, String message) {
        System.out.println(message);
        do {
            if (!scanner.hasNextInt()) {
                System.err.println("Dữ liệu không phải số nguyên, vui lòng nhập lại");
                scanner.nextLine();
                continue;
            }
            return Integer.parseInt(scanner.nextLine());
        } while (true);
    }
}
