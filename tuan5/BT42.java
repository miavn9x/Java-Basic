package tuan5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT42 {
    public static void main(String[] args) {
                Scanner ip = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.##");

        System.out.print("Nhap x: ");
        float x = ip.nextFloat();
        System.out.print("Nhap y: ");
        int y = ip.nextInt();

        double  P = 1;
        for (int i = 1; i <= y; i++) {
            P *= x;
        }

        System.out.println("P la: " + dc.format(P));
    }
}
