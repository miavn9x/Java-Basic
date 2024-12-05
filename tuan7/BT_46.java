package tuan7;

import java.util.Scanner;

public class BT_46 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap n: ");
            n = kb.nextInt();
            if (n <= 0)
                System.out.println("nhap lai (n > 0) ");
        }while (n <= 0) ;
        KT_SNT(n);
    }public static boolean KTSNT (int n) {
        int d = 0;
        for (int i = 1; i <= n; i++)
                if (n % i == 0)
                    d++;
        if (d == 2)
            return true;
        return false;            
    }
    /* */
    public static void KT_SNT (int n) {
        for(int i = 1; i <= n; i++)
        {
            boolean  kq = KTSNT(i);
            if (kq == true)
                System.out.println(i);
        }
    }
}
