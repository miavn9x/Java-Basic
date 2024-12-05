package tuhoc;
import java.util.Scanner;

public class kt {
 public static boolean KT_SHT(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    public static void tong_SHT(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (KT_SHT(i)) {
                tong += i;
            }
        }
        System.out.println(tong);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (n <= 0) {
                System.out.println("nhap lai");
            }
        } while (n <= 0);

        System.out.print("Tong so hoan thien nho hon n: ");
        tong_SHT(n);
    }   
}
