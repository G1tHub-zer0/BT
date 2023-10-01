package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            ans += a[i];
        }
        int min = a[0];
        for(int i = 0; i < n; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
