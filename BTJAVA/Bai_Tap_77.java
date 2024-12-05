import java.util.Scanner;

public class Bai_Tap_77 {
    public static void NhapMang(int[] a, int n) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        for (int i = 0; i < n; i++) {
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
    public static void VT_PTNT_LH_23(int [] a) {
        System.out.print("Vi tri cac phan tu la so nguyen to lon hon 23 trong mang: ");
        for (int i = 0; i < a.length; i++) {
            if (KT_SNT(a[i]) && a[i] > 23) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n;
        do {
            System.out.println("Nhap so luong phan tu cua mang: ");
            n = ip.nextInt();
            if (n <= 0)
                System.out.println("So luong phan tu khong hop le. Vui long nhap lai!");
        } while (n <= 0);
        int[] a = new int[n];

        NhapMang(a, n);
        VT_PTNT_LH_23(a);

        ip.close();
    }
}
