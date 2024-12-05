package tuan5;
import java.util.Scanner;

public class BT30 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		System.out.print(" Nhap  n: ");
        int n= kb.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 2 * i + 1;
        }
        System.out.println("Tổng S = " + sum);
    }
}
