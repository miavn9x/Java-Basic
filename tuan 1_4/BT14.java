import java.util.Arrays;
import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);

        System.out.println("nhap a:");
        int a = kbScanner.nextInt();
        System.out.println("nhap b:");
        int b = kbScanner.nextInt();
        System.out.println("nhap c:");
        int c = kbScanner.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        System.out.println("so tang dan: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
