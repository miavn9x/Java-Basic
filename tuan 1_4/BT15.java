import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
            System.out.println("a");
            int a = kb.nextInt();
            System.out.println("b");
            int b = kb.nextInt();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("phuong trinh vo so nghiem.");
                }
                else {
                    System.out.println("phuong trinh vo nghiem.");
                }
            }
            else {
                double x = -b / a;
                System.out.println("nghiem pt: " + x);
        }
    }
}
