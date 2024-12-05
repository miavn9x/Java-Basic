import java.util.Scanner;

public class BT22 {
    public static void main(String[] args) {
         int a;
        int b;
        int c;
        Scanner tamgiac = new Scanner(System.in);
        System.out.println("nhap a : ");
        a = tamgiac.nextInt();
        System.out.println("nhap b : ");
        b = tamgiac.nextInt();
        System.out.println("nhap c : ");
        c = tamgiac.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                if (a == b || a == c || b == c) {
                    System.out.println("thuoc tam giac vuong can");
                } else {
                    System.out.println("thuoc tam giac vuong");
                }
            } else if (a == b && a == c && c == b) {
                System.out.println("thuoc tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.println("thuoc tam giac can");
            }
        } else {
            System.out.println("khong thuoc tam giac nao");
        }
        tamgiac.close();
    }
}
