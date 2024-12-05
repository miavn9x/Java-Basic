package tuan5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT40 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.##");

        int n;
        do {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (n < 0) {
                System.out.println("n khong hop le, vui long nhap lai!");
            }
        } while (n <= 0);

        double A = 1;
        double B = 0;
        double S = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                A *= j;
            }
            B += i;
            S += B / (float) A;
            A = 1;
        }
        System.out.println("S la: " + dc.format(S));
    }
}
