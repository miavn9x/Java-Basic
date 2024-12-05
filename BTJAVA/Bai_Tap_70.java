import java.util.Scanner;

public class Bai_Tap_70 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap phan tu n");
        int n = ip.nextInt();
        int[] a = new int[n];
        nhapmang(a);
        cacphantuchanbehon20(a);
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

    public static void cacphantuchanbehon20(int[] a) {
        System.out.println("cac phan tu chan be hon 20");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] < 20) {
                System.out.print(a[i] + "\t");
            }
        }
    }
}
