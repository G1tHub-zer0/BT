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
        int max = a[0];
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
