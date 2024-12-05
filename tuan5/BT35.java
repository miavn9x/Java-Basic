package tuan5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT35 {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("#.###");
        int n;
        double sum = 0;
        Scanner kp = new Scanner(System.in);
        do {
            System.out.println(" nhap n");
            n = kp.nextInt();
        } while (n <= 1);
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, i);
        }
        System.out.println("tong = " + dc.format(sum));
    }
}