package tuan7;

import java.util.Scanner;

public class BT_44 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        int cd = kb.nextInt();

        System.out.println("nhap chieu rong");
        int cr = kb.nextInt();

        tinhdt(cd, cr);
        tinhcv(cd, cr);

        int kq = tinhdt2 (cd, cr);
        System.out.println("dien tich: "+kq);

        int kq1 = tinhdt2 (cd, cr);
        System.out.println("chu vi: "+kq1);

    }
    public static void tinhdt(int cd, int cr) {
        int dt = cd * cr;
        System.out.println("dien tich: "+dt);
    }
    public static void tinhcv(int cd, int cr) {
        int cv = (cd + cr)*2;
        System.out.println("chu vi: "+cv);
    }
    /// tra VE
    public static int tinhdt2(int cd, int cr) {
        int dt = cd * cr;
        return dt;
    }
    public static int tinhcv2(int cd, int cr) {
            int cv = (cd + cr)*2;
            return cv;
        }
}
