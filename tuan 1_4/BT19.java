import java.util.Scanner;

public class BT19 {
    public static void main(String[] args) {
        Scanner sreach = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen n co 3 chu so :");
        n = sreach.nextInt();

        int socuoi = n % 10;
        int tg = n / 10;
        int sogiua = tg % 10;
        int sodau = tg / 10;

        if (sodau > sogiua) {
            int T = sodau;
            sodau = sogiua;
            sogiua = T;
        }
        if (sodau > socuoi) {
            int T = sodau;
            sodau = socuoi;
            socuoi = T;
        }
        if (sogiua > socuoi) {
            int T = sogiua;
            sogiua = socuoi;
            socuoi = T;
        }

        System.out.println("ket qua : " + sodau + sogiua + socuoi);
    }
}
