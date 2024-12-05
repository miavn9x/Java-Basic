package tuan5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int n;
        float sum = 0;

        // Yêu cầu người dùng nhập n cho đến khi n là số nguyên dương
        do {
            System.out.print("Nhập n (số nguyên dương): ");
            n = sc.nextInt();
        } while (n < 1);

        // Tính tổng của dãy số nghịch đảo từ 1 đến n
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Sử dụng 1.0 để đảm bảo phép chia là số thực
        }

        // Hiển thị kết quả
        System.out.println("Tổng = " + decimalFormat.format(sum));
        
        // Đóng Scanner
        sc.close();
    }
}