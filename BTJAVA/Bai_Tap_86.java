import java.util.Scanner;

public class Bai_Tap_86 {
    public static void NhapMang(int[] a, int n) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        ip.close();
    }
    public static void PT_1_X(int[] a, int x) {
        System.out.print("Phan tu co gia tri tu 1 den X: ");
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 1 && a[i] <= x) {
                System.out.print(a[i] + " ");
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
        System.out.println("Nhap x: ");
        int x = ip.nextInt();

        NhapMang(a, n);
        PT_1_X(a, x);

        ip.close();
    }
}
