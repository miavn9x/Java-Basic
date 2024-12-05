package tuan9;

import java.util.Scanner;
public class bt_52 {
    public static boolean TL_TG (float a, float b, float c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean TGV (float a, float b, float c) {
        if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean TGC (float a, float b, float c) {
        if ((a == b) || (a == c) || (b == c)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean TGD (float a, float b, float c) {
        if ((a == b) && (a == c) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }
    public static void areas (float a, float b, float c) {
        float p = (a + b + c) / 2;
        double areas = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Dien tich hinh tam giac la: " + areas);
    }
    public static void dc_a (float a, float b, float c) {
        float p = (a + b + c) / 2;
        double dc = (2 * Math.sqrt(p * (p - a) * (p - b) * (p - c)) / a);
        System.out.println("Duong cao thu nhat cua tam giac la: " + dc);
    }
    public static void dc_b (float a, float b, float c) {
        float p = (a + b + c) / 2;
        double dc = (2 * Math.sqrt(p * (p - a) * (p - b) * (p - c)) / b);
        System.out.println("Duong cao thu hai cua tam giac la: " + dc);
    }
    public static void dc_c (float a, float b, float c) {
        float p = (a + b + c) / 2;
        double dc = (2 * Math.sqrt(p * (p - a) * (p - b) * (p - c)) / c);
        System.out.println("Duong cao thu ba cua tam giac la: " + dc);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int a,b,c;
        do
        {
            System.out.print("Canh 1: ");
            a = ip.nextInt();
            System.out.print("Canh 2: ");
            b = ip.nextInt();
            System.out.print("Canh 3: ");
            c = ip.nextInt();
            if (a <= 0)
                System.out.println("Canh 1 be hon 0, vui long nhap lai!");
            if (b <= 0)
                System.out.println("Canh 2 be hon 0, vui long nhap lai!");
            if (c <= 0)
                System.out.println("Canh 3 be hon 0, vui long nhap lai!");
        } while (a <= 0 || b <= 0 || c <= 0);
        ip.close();

        if (TL_TG(a, b, c)) {
            if(TGV(a, b, c)) {
                System.out.println(a + " " + b + " "+ c + " thanh lap tam giac vuong");
                areas(a, b, c);
                dc_a(a, b, c);
                dc_b(a, b, c);
                dc_c(a, b, c);
            } else if (TGD(a, b, c)) {
                System.out.println(a + " " + b + " " + c + " thanh lap tam giac deu");
areas(a, b, c);
                dc_a(a, b, c);
                dc_b(a, b, c);
                dc_c(a, b, c);
            } else if (TGC(a, b, c)) {
                System.out.println(a + " " + b + " " + c + " thanh lap tam giac can");
                areas(a, b, c);
                dc_a(a, b, c);
                dc_b(a, b, c);
                dc_c(a, b, c);
            } else {
                System.out.println(a + " " + b + " " + c + " thanh lap tam giac thuong");
                areas(a, b, c);
                dc_a(a, b, c);
                dc_b(a, b, c);
                dc_c(a, b, c);
            }
        } else {
            System.out.println(a + " " + b + " " + c + " khong thanh lap tam giac");
        }
    }
}
    

