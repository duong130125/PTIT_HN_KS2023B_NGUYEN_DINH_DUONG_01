package ra.bussiness;

import ra.presentation.StudentApplication;

import java.util.Scanner;

public class StudentBusiness {
    public static void displayListStudent() {
        if (StudentApplication.currentStudentIndex == 0) {
            System.out.println("Chưa có Sinh viên nào.");
            return;
        }
        for (int i = 0; i < StudentApplication.currentStudentIndex; i++) {
            StudentApplication.arrStudent[i].displayData();
        }
    }

}
