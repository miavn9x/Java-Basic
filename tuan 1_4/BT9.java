import java.util.Scanner;
public class BT9 {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);

            System.out.println("nhap gia tri a");

            int a;
            a = keyboard.nextInt();

            System.out.println("nhap gia tri b");
            int b;
            b = keyboard.nextInt();

            double tong = a+b;
            double hieu = a-b;
            double tich = a*b;
            double thuong = a/b;

            System.out.println("tong ab = "+ tong);
        
    }
    
}
