package tuan9;

import java.util.Scanner;

public class bt_50 {
    public static int TT(int gio_1, int gio_2) {
        int total = 0;        if(gio_1 >= 6 && gio_2 < 17)
        total = (gio_2 - gio_1) * 2500;        else if (gio_1 > 17 && gio_2 < 21)
        total = (gio_2 - gio_1) * 3000;        else
        total = (17 - gio_1) * 2500 + (gio_2 - 17) * 3000;        return total;
        }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int gio_1, gio_2;
            do {            
                System.out.print("gio bat dau: ");
            gio_1 = ip.nextInt();
            System.out.print("gio ket thuc: ");
            gio_2 = ip.nextInt();
            if (gio_1 < 6) {
            System.out.println("Gio bat dau khong hop le");            }
        if (gio_2 > 21) {
            System.out.println("Gio ket thuc khong hop le");
        }            if (gio_1 >= gio_2) {
        System.out.println("Gio bat dau lon hon hoac bang gio ket thuc");            }
        } while (gio_1 < 6 || gio_2 > 21 || gio_1 >= gio_2);
        ip.close();
        System.out.println("Tien thue may cua ban la: " + TT(gio_1, gio_2));    

    }
}
