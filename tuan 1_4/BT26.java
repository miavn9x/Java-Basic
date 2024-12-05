import java.util.Scanner;

public class BT26 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n = kp.nextInt();
        int a = 0;

        if (n < 2) {
            a=1;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    a=1;
                }
            }
        }

        if (a != 0) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            System.out.println(n + " la so nguyen to");
        }

        kp .close();
    }
}
