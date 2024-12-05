import java.util.Scanner;

public class Bai_Tap_82 {
    public static void NhapMang(int[] a, int n) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        ip.close();
    }
    public static void Boi_3_5(int[] a) {
        System.out.print("Phan tu la boi cua 3 hoac cua 5: ");
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 3 == 0 || a[i] % 5 == 0) {
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

        NhapMang(a, n);
        Boi_3_5(a);

        ip.close();
    }
}
