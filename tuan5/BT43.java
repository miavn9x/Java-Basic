package tuan5;

import java.util.Scanner;

public class BT43 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = ip.nextInt();

        int A = 0;
        int S = 0;
        for(int i = 1; i <= n; i++) {
            A += i;
            S += A;
        }
        
        System.out.println("S la: " + S);
        
    }
}
