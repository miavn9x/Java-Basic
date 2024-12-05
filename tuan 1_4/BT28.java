import java.util.Scanner;

public class BT28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("nhap n : ");
        n = input.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("PT hoan thien : ");

        } else {
            System.out.println("PT khong hoan thien : ");

        }
        input.close();
    }
}
