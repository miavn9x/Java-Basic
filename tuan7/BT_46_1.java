package tuan7;

import java.util.Scanner;

public class BT_46_1 {
    public static boolean KT_SCP(int n){
        double a = Math.sqrt(n);
        if (a*a == n)
            return true;
        return false;
    }
    public static void SCP_NH_N(int n) {
        for(int i = 1; i <= n; i++){
            if (KT_SCP(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("nhap n: ");
            n = ip.nextInt();
            if (n <= 0)
                System.out.println("nhap lai (n > 0) ");
        }while (n <= 0) ;
        System.out.println(" so cp nho hon n");
        SCP_NH_N(n);
    }
}
