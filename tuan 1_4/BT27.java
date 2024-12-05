import java.util.Scanner;

public class BT27 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = kp.nextInt();
        System.out.println("nhap so b");
        int b = kp.nextInt();
        int n = a;
        int m = b;

        while (b != 0) {
            int tg = b;
            b = b % a;
            a = tg;
        }

        int BCNN = (n * m) / a;
        System.out.println("uoc chung lon nhat la : " + a);
        System.out.println("boi chung nho nhat la : " + BCNN);
        kp.close();

    }
}
