import java.util.Arrays;
import java.util.Scanner;

public class ahihi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        nhapMang(a, n);
        System.out.println("Vi tri cac phan tu kkhong la so chinh phuong nho hon 20:");
        inViTriKhongLaChinhPhuong(a, n);
        double trungBinhAm = tinhTrungBinhAm(a, n);
        System.out.println("Trung binh cong cac phan tu am trong mang (tru -3, -5): " + trungBinhAm);
        sapXepTangDan(a, n);
        System.out.println("Mang sau khi sap xep cai phan tu nho hon 10 tang dan: " + Arrays.toString(a));
        int viTriLeLonNhat = timViTriLeLonNhat(a, n);
        System.out.println("Vi tri phan tu le lon nhat trong mang: " + viTriLeLonNhat);
    }
    public static void nhapMang(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static void inViTriKhongLaChinhPhuong(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (!laSoChinhPhuong(a[i]) && a[i] < 20) {
                System.out.println("Vi tri " + i + ": " + a[i]);
            }
        }
    }
    public static boolean laSoChinhPhuong(int x) {
        int canBacHai = (int) Math.sqrt(x);
        return canBacHai * canBacHai == x;
    }
    public static double tinhTrungBinhAm(int[] a, int n) {
        int tongAm = 0;
        int soLuongAm = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0 && a[i] != -3 && a[i] != -5) {
                tongAm += a[i];
                soLuongAm++;
            }
        }
        return soLuongAm > 0 ? (double) tongAm / soLuongAm : 0;
    }
    public static void sapXepTangDan(int[] a, int n) {
        Arrays.sort(a, 0, n);
    }
    public static int timViTriLeLonNhat(int[] a, int n) {
        int viTriLeLonNhat = -1;
        int giaTriLeLonNhat = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0 && a[i] > giaTriLeLonNhat) {
                giaTriLeLonNhat = a[i];
                viTriLeLonNhat = i;
            }
        }
        return viTriLeLonNhat;
    }
}
