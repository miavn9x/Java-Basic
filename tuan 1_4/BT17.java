import java.text.DecimalFormat;
import java.util.Scanner;

public class BT17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.###");
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                float t_3 = - b / c;
                if (t_3 > 0) {
                    double x_7 = Math.sqrt(t_3);
                    double x_8 = -x_7;
                System.out.println("Phuong trinh co nghiem " + x_7 + " " + x_8);
                }
            }
        } else {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            float t = -b / (2 * a);
            if (t < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                double x_1 = Math.sqrt(t);
                double x_2 = -x_1;
                System.out.println("x_1 = " + dc.format(x_1) + "x_2 = " + dc.format(x_2));
            }
        } else {
            double t_1 = (-b + Math.sqrt(delta) / 2 * a);
            double t_2 = (-b - Math.sqrt(delta) / 2 * a);
            if (t_1 < 0 && t_2 < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            if (t_1 >= 0) {
                double x_3 = Math.sqrt(t_1);
                double x_4 = -x_3;
                System.out.println("x_1 = " + dc.format(x_3));
                System.out.println("x_2 = " + dc.format(x_4));
            }
            if (t_2 >= 0) {
                double x_5 = Math.sqrt(t_2);
                double x_6 = -x_5;
                System.out.println("x_3 = " + dc.format(x_5));
                System.out.println("x_4 = " + dc.format(x_6));
            }
        }
        input.close();
    }
}
}
