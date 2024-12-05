package tuan9;

import java.util.Scanner;

public class bt_54 {
    public static double ND_GT(int n) {
        long GT = 1;
        for (int i = 1; i <= n; i++) {
            GT *= i;
        }
        double NDGT = 1 / (double) GT;
        return NDGT;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n;
        do
        {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (n < 0)
                System.out.println("n < 0, vui long nhap lai!");
        } while (n < 0);
        ip.close();
        System.out.print("Ngich dao cua n giai thua la: " + ND_GT(n));
    }
}
