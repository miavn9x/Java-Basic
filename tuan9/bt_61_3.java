package tuan9;
/* bt số nguyên tố */
import java.util.Scanner;

public class bt_61_3 {
    public static boolean KT_SNT(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a==2) {
            return true;
        }
        return false;
    } 
    public static void n_SNT_DT(int n) {
        int a = 0;
        int i = 2;
        while (a < n)
        {
            if(KT_SNT(i)) {
                System.out.print(i + " ");
                a++;
            }
            i++;
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
                System.out.println("n khong hop le, vui long nhap lai!");
            }
        } while (n <= 0);
        ip.close();

        System.out.print("n so nguyen to dau tien la: ");
        n_SNT_DT(n);
    }
    
}
