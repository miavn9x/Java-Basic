package tuan7;

import java.util.Scanner;

public class BT46_2 {
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
                System.out.println(" khong hop le, nhap lai! ");
            }
        } while (n <= 0);
        ip.close();
        
        System.out.print("So ht nho hon n : ");
        SHT_NH_n(n);
    }
}
