package tuan5;

import java.math.BigInteger;
import java.util.Scanner;

public class BT32 {
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        System.out.println("nhap n :");
        int n = index.nextInt();
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
