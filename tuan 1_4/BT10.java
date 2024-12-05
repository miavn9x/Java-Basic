import java.util.Scanner;
public class BT10 {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);

            System.out.println("nhap gia tri a");
            int a;
            a = keyboard.nextInt();

            System.out.println("nhap gia tri b");
            int b;
            b = keyboard.nextInt();

            System.out.println("nhap gia tri c");
            int c;
            c = keyboard.nextInt();

            System.out.println("nhap gia tri d");
            int d;
            d = keyboard.nextInt();

            double tbc = (a+b+c+d)/4;
     
            System.out.println("tbc abcd = "+ tbc);
        
    }
    
}
