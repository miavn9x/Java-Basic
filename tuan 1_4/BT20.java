import java.util.Scanner;

public class BT20 {
    public static void main(String[] args) {
        int gio;
        int phut;
        int giay;
        Scanner thoigian = new Scanner(System.in);
        System.out.println("nhap gio : ");
        gio = thoigian.nextInt();
        System.out.println("nhap phut : ");
        phut = thoigian.nextInt();
        System.out.println("nhap giay : ");
        giay = thoigian.nextInt();
        if (gio > 24) {
            System.out.println("ban nhap sai gio");
        } else if (phut > 60) {
            System.out.println("ban nhap sai phut");
        } else if (giay > 60) {
            System.out.println("ban nhap sai giay");
        } else {
            System.out.println(gio + "gio;" + phut + "phut;" + giay + "giay");
        }
    }
}
