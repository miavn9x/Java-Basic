package tuan9;

import java.util.Scanner;

public class bt_53 {
    public static int USCLN (int a, int b) {
        int USCLN = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                USCLN = i;
            }
        }
        return USCLN;
    }
    public static int BSCNN (int a, int b) {
        int BSCNN = (a * b) / USCLN(a,b);
        return BSCNN;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int a,b;
        do
        {
            System.out.print("Nhap so thu nhat: ");
            a = ip.nextInt();
            System.out.print("Nhap so thu hai: ");
            b = ip.nextInt();
            if (a <= 0)
                System.out.println("So thu nhat be hon hoac bang 0, vui long nhap lai!");
            if (b <= 0)
                System.out.println("So thu hai be hon hoac bang 0, vui long nhap lai!");
        } while (a <= 0 || b <= 0);
        ip.close();

        System.out.println("Uoc so chung lon nhat la: " + USCLN(a,b));
        System.out.println("Boi so chung nho nhat la: " + BSCNN(a,b));
    }
}
