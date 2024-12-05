package tuan5;

import java.util.Scanner;

public class BT33 {
    public static void main(String[] args) {
        int n;
        long result = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap n: ");
            n = scanner.nextInt();
        } while (n < 0);
        for (int i = 0; i <= n; i++) {
            result *= (2 * i + 1);
        }
        System.out.println("kp = " + result);
    }
}