package Main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã số sinh viên: ");
        String maSoSinhVien = scanner.nextLine();

        String regex = "^B[1-9]{7}$";

        boolean isValid = Pattern.matches(regex, maSoSinhVien);

        if (isValid) {
            System.out.println("Mã số sinh viên hợp lệ.");
        } else {
            System.out.println("Mã số sinh viên không hợp lệ. Định dạng đúng là Bxxxxxxx (x là số từ 1-9).");
        }
    }
}
