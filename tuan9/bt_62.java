package tuan9;

import java.util.Scanner;

public class bt_62 {
    public static boolean KT_SHT(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum != n) {
            return false;
        }
        return true;
    }
    public static void SHT_NH_n(int n) {
        for (int i = 1; i < n; i++) {
            if (KT_SHT(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n;
        do
        {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
            if (n <= 0) {
                System.out.println("n khong hop le,nhap lai!");
            }
        } while (n <= 0);
        ip.close();
        
        System.out.print("So hoan thien nho hon n la: ");
        SHT_NH_n(n);
    }
}
