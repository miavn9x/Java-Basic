import java.util.Scanner;

public class BT18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên gồm ba chữ số:");
        int n = scanner.nextInt();

        int maxDigit = n % 10;
        int position = 1;
        n /= 10;

        for (int i = 2; i <= 3; i++) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
                position = i;
            }
            n /= 10;
        }

        System.out.println("Chữ số lớn nhất là " + maxDigit + " ở vị trí thứ " + position);
    }
}
