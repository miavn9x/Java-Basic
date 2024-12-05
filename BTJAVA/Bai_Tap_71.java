import java.util.Scanner;

public class Bai_Tap_71 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap phan tu n ");
        int n = ip.nextInt();
        int[] a = new int[n];
        nhapmang(a);
        xuatcacphantusonguyento(a);
        ip.close();
    }

    public static void nhapmang(int[] a) {
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] =");
            a[i] = ip.nextInt();
        }
        ip.close();
    }

    public static boolean KT_SNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void xuatcacphantusonguyento(int[] a) {
        System.out.println("cac phan tu la so nguyen to");
        for (int i = 1; i < a.length; i++) {
            if (KT_SNT(a[i])) {
                System.out.print(a[i] + "\t");
            }
        }
    }
}
