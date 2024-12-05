import java.util.Random;
import java.util.Scanner;

public class Bai_Tap_66 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap so lan in ra");
        int n = ip.nextInt();
        int[] a = new int[n];
        random(a);
        xuatmang(a);
        ip.close();
    }

    public static void random(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = -rd.nextInt(10);
        }
    }

    public static void xuatmang(int[] a) {
        System.out.println("cac phan tu cua mang");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
