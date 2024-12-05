package tuan9;

import java.util.Scanner;

public class bt_51 {
    public static int TT_L(int a, int b) {
        int total = 0;
        if(a >= 6 && b <= 12)
            total = (b - a) * 6000;
        else if (a >= 12 && b <= 18)
            total = (b - a) * 7500;
        else
            total = (12 - a) * 6000 + (b - 12) * 7500;
        return total;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int h_1, h_2;
        do
        {
            System.out.print("Nhap gio vao ca: ");
            h_1 = ip.nextInt();
            System.out.print("Nhap gio ra ca: ");
            h_2 = ip.nextInt();
            if (h_1 < 6)
                System.out.println("Gio vao ca khong hop le, vui long nhap lai!");
            if (h_2 > 18)
                System.out.println("Gio ra ca khong hop le, vui long nhap lai!");
            if (h_1 >= h_2)
                System.out.println("Gio vao ca lon hon hoac bang gio ra ca, vui long nhap lai!");
        } while (h_1 < 6 || h_2 > 18 || h_1 >= h_2);
        ip.close();

        System.out.print("Tien luong hom nay la: " + TT_L(h_1, h_2));  
    }
}
