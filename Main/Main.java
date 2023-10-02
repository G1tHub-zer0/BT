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
    static void print(String s, char c){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        if(check(s, c) == true) {
            print(s, c);
        }else{
            System.out.println("Khong ton tai trong chuoi");
        }
    }
}
