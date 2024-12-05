import java.util.Scanner;

public class BT16 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("a");
        int a = kb.nextInt();
        System.out.println("b");
        int b = kb.nextInt();
        System.out.println("c");
        int c = kb.nextInt();

        if(a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so nghiem.");
                }
                else {
                    System.out.println("phuong trinh vo nghiem.");
                }
            }
            else {
                double x = -b / c;
                System.out.println("nghiem pt: " + x);
        }  
        } else {

        double delta = b * b - (4 * a * c);

        if (delta < 0) {
            System.out.println("PT vo nghiem");
        } else if (delta == 0) {
        
            System.out.println("PT co nghiem kep " + (- b / (2 * a)));
        } else {
            double x_1 = (- b + Math.sqrt(delta) / 2 * a);
            double x_2 = (- b - Math.sqrt(delta) / 2 * a);
            System.out.println("PT co 2 nghiem " + x_1 + x_2);
        }
 
    }
    }
}
