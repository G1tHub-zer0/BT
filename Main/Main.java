package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.println("Co");
                return;
            }
        }
        System.out.println("khong");
    }
}
