package Main;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[5];
        for(int i = 0; i < 5; i++){
            a[i] = sc.next();
            if(a[i].length() != 8){
                System.out.println("Sai roi");
                break;
            }
        }
        String regex = "00[2,5]'L'[0,9]{4}";
        for(int i = 0; i < 5; i++){
            boolean isvalid  = Pattern.matches(regex, a[i]);
            if(isvalid){
                System.out.println("Sai roi");
                break;
            }
        }
        System.out.println("Dung roi");
    }
}
