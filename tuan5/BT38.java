package tuan5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT38 {
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

        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += (i / (float) (i + 1));
        }
        System.out.println("S la: " + dc.format(S));

    }
}
