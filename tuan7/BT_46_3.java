package tuan7;

import java.util.Scanner;

public class BT_46_3 {
     public static boolean kt_snt(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sht_nh_n(int n) {
        for (int i = 1; i < n; i++) {
            if (kt_snt(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (n <= 0) {
                System.out.println("nhap lai!");
            }
        } while (n <= 0);
        ip.close();

        System.out.println("Snt nho hon n la:");
        sht_nh_n(n);

    }
}
