import java.util.Scanner;
public class Bai_Tap_72 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap phan tu n");
        int n = ip.nextInt();
        int[] a = new int[n];
        nhapmang(a);
        xuatcacphantulasochinhphuong(a);
        ip.close();
    }

    public static void nhapmang(int[] a) {
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = ");
            a[i] = ip.nextInt();
        }
        ip.close();
    }

    public static boolean KT_SCP(int n) {
        double a = Math.sqrt(n);
        if (a * a == n)
            return true;
        return false;
    }

    public static void xuatcacphantulasochinhphuong(int[] a) {
        System.out.println("cac phan tu la so chinh phuong tai vi tri le");
        for (int i = 0; i < a.length; i++) {
            if (KT_SCP(a[i]) && i % 2 != 0) {
                System.out.print("vi tri " + i + ":" + a[i] + "\t");
            }
        }
    }
}