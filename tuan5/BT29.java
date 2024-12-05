package tuan5;
import java.util.Scanner;

public class BT29 {
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap  n: ");
        int n= kb.nextInt();
        for (int i = 0; i <= (2*n + 1 ); i = +2) {
            
            if (i<= n) {
                System.out.println("kb ="+n);
            }
        }kb.close();

    }

}