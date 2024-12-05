package tuan9;

import java.util.Scanner;

public class bt_56 {
    public static int KT_N(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }
    public static int D_SL(int n) {
        int dem = 0;
        while (n != 0) {
            if (n % 2 != 0) {
                dem++;
            }
            n /= 10;
        }
        return dem;
    }
    public static int D_SC(int n) {
        int dem = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                dem++;
            }
            n /= 10;
        }
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
        System.out.println("n co " + D_SC(n) + " so chan va " + D_SL(n) + " so le");
    }
}
