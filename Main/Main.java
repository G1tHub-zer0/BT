package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <=0 || n > 20){
            System.out.println("So "+ n + " khong hop le");
        }
        int[] a = new int[20];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < 20; i++){
            a[i] = a[i - 2] + a[i - 1];
            if(i == n){
                System.out.println(a[i]);
            }
        }
    }
}
