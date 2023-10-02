package Main;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static int check(String s){
        int x = Integer.valueOf(s.substring(s.length()-1));
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = s.length() - 1;
        if (s.length() <= 20) {
            if (!s.contains(" ")) {
                if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
                        if(check(s) >= 0 && check(s) <= 9){
                            System.out.println("Duyet");
                            return;
                    }
                }
            }
        }
        System.out.println("Khong duyet");
    }
}
