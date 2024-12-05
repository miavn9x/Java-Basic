import java.util.Scanner;

public class BT23 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int a;
        System.out.println("nhap a : ");
        a = input.nextInt();
        double n = Math.sqrt(a);
        double T = n * n;
        if (T == a) {
            System.out.println("la so chinh phuong");
        } else {
            System.out.println("khong phai so chinh phuong");
        }
        input.close();
    }
}
