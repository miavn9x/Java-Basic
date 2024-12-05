package tuan9;

import java.util.Scanner;
/* bt số chính phương*/
public class bt_61_1 {
    public static boolean KT_SCP(int n) {
        double a = Math.sqrt(n);
        if (a * a == n)
            return true;
        return false;
    } 
    public static void n_SCP_DT(int n) {
        int a = 0;
        int i = 1;
        while (a < n)
        {
            if(KT_SCP(i)) {
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

        System.out.print("n so chinh phuong dau tien la: ");
        n_SCP_DT(n);
    }
}
