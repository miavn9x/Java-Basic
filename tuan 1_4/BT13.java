import java.util.Scanner;
public class BT13 {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);

        System.out.println("nhap a:");
        int a = kbScanner.nextInt();
        System.out.println("nhap b:");
        int b = kbScanner.nextInt();
        System.out.println("nhap c:");
        int c = kbScanner.nextInt();

        int max_1 = a > b ? a : b;
        int max_2 = max_1 > c ? max_1 : c;

        System.out.println("So lon nhat la: " + max_2);

    }
}