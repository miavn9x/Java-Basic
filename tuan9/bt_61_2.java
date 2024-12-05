package tuan9;

import java.util.Scanner;

/* bt số hoàn ỵieenj*/
public class bt_61_2 {
    public static boolean KT_SHT(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
    } 
    public static void n_SHT_DT(int n) {
        int a = 0;
        int i = 1;
        while (a < n)
        {
            if(KT_SHT(i)) {
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

        System.out.print("n so hoan thien dau tien la: ");
        n_SHT_DT(n);
    }
    
}
