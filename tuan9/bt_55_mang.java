package tuan9;

import java.util.Scanner;

public class bt_55_mang {
    public static void HV(int c[]) {
        int t = c[0];
        c[0] = c[1];
        c[1] = t;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = ip.nextInt();
        System.out.print("Nhap b: ");
        int b = ip.nextInt();
        int c[] = {a,b};
        ip.close();
        System.out.println("Truoc khi hoan vi: " + "a = " + c[0] + "; b = " + c[1]);
        HV(c);
        System.out.print("Sau khi hoan vi: " + "a = " + c[0] + "; b = " + c[1]);
    }
}
