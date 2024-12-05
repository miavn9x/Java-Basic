package tuan9;

import java.util.Scanner;

public class bt_59 {
    public static int KT_N(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }
    public static int ULLN(int n) {
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0 && i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (KT_N(n) > 5 || n < 0) {
                System.out.println("n khong hop le, vui long nhap lai!");
            }
        } while (KT_N(n) > 5 || n < 0);
        ip.close();

        System.out.print("Uoc so le lon nhat la: " + ULLN(n));

    }
}
