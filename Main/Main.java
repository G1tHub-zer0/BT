package Main;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            list.add(sc.nextLine());
        }
        if (list.size() != 8) {
            System.out.println("Khong hop le");
        }
        int j = 0;
        if (list.get(0) != "B") {
            System.out.println("Khong hop le");
        } else if (list.get(1) != "1") {
            System.out.println("Khong hop le");
        } else if (list.get(2) != "7") {
            System.out.println("Khong hop le");
        } else if (list.get(3) != "0") {
            System.out.println("Khong hop le");
        } else {
            for (int i = 4; i < list.size(); i++) {
                a[j] = Integer.valueOf(list.get(i));
                j++;
            }
            for (int i = 0; i < 4; i++) {
                if (a[i] < 1 && a[i] > 9) {
                    break;
                }
            }
            System.out.println("Hop le");
        }
    }
}
