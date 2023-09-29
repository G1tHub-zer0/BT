package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i = 0;
        while(i <= n){
            if(i % 2 == 0){
                ans += i;
            }
            i++;
        }
        System.out.println(ans);
    }
}
