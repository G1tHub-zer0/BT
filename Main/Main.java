package Main;
import java.util.Scanner;

public class Main {
    static boolean check(String s, char c){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        if(check(s, c) == true) {
            System.out.println("Co");
        }else{
            System.out.println("Khong");
        }
    }
}
