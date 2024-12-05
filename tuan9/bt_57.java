package tuan9;

import java.util.Scanner;

public class bt_57 {
    public static int KT_N(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }
    public static boolean KT_SNT(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a != 2) {
            return false;
        }
        return true;
    }

    public static int D_SNT(int n) {
        int a;
        int dem = 0;
        do {
            a = n % 10;
            if (KT_SNT(a)) {
                dem++;
            }
            n /= 10;
        } while (n != 0);
        return dem;
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

        System.out.println(n + " co " + D_SNT(n) + " chu so la so nguyen to");
    }
}
