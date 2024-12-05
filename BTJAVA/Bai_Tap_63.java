import java.util.Scanner;

public class Bai_Tap_63 {
    public static void main(String[] args) {
        int n = 4;
        int[] a = new int[n];
        nhapmang(a);
        xuatmang(a);

    }

    public static void nhapmang(int[] a) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] =");
            a[i] = input.nextInt();
        }
        input.close();
    }

    public static void xuatmang(int[] a) {
        System.out.println("mang vua nhap");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

}