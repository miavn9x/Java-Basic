package tuan5;

import java.util.Scanner;

public class BT31 {
    public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
		System.out.print("Nhap  n: ");
        int n= kb.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * Math.pow(-1, i + 1);
        }
        System.out.println("Tong S = " + sum);
    }
}