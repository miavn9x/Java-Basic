package tuan7;

import java.util.Scanner;

public class BT_47 {
    public static boolean KT_SNT(int n) {
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

    public static void n_SNT(int n) {
        int a = 0;
        int i = 2;
        while (a < n) {
            if (KT_SNT(i)) {
                System.out.print(i + " ");
                a++;
            }
            i++;
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

        System.out.println(n + " SNT dau tien la:");
        n_SNT(n);

    }
}
