package tuan9;

import java.util.Scanner;

public class bt_55 {
    public static void HV(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.print("Sau khi hoan vi: " + "a = " + a + "; b = " + b);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = ip.nextInt();
        System.out.print("Nhap b: ");
        int b = ip.nextInt();
        ip.close();
        System.out.println("Truoc khi hoan vi: " + "a = " + a + "; b = " + b);
        HV(a, b);
    }
}
