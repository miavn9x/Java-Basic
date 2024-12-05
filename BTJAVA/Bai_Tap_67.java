import java.util.Random;
import java.util.Scanner;

public class Bai_Tap_67 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap phan tu n");
        int n = ip.nextInt();
        int[] a = new int[n];
        mangtangdan(a);
        xuatmang(a);
        ip.close();

    }

    public static void mangtangdan(int[] a) {
        Random rd = new Random();

        a[0] = rd.nextInt(10);

        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + rd.nextInt(10);
        }
    }

    public static void xuatmang(int[] a) {
        System.out.println("so phan tu tang dan");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
