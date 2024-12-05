package tuan9;

import java.util.Scanner;

public class bt_60 {
    public static int KT_N(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }
    public static boolean KT_TL(int n) {
        int a = 0;
        boolean S = true;
        do {
            a = n % 10;
            if (a % 2 == 0) {
                S = false;
            }
            n /= 10;
        }
        while(n != 0);
        return S;
    }
    public static boolean KT_TC(int n) {
        int a = 0;
        boolean S = true;
        do {
            a = n % 10;
            if (a % 2 != 0) {
                S = false;
            }
            n /= 10;
        }
        while(n != 0);
        return S;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n;
        do
        {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (KT_N(n) > 5 || n < 0) {
                System.out.println("n khong hop le, vui long nhap lai!");
            }
        } while (KT_N(n) > 5 || n < 0);

        if(KT_TC(n)) {
            System.out.println("Cac chu so cua n toan chan");
        } else if (KT_TL(n)) {
            System.out.println("Cac chu so cua n toan le");
        } else {
            System.out.println("Cac chu so cua n vua le vua chan");
        }

        ip.close();
    }
}
