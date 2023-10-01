package Main;
import java.util.Scanner;

public class Main {
    static void sort(int[] a){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            ans += a[i];
        }
        sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
