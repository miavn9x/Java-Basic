import java.util.Scanner;

public class BT21 {
    public static void main(String[] args) {
         int km;
        Scanner tienTaxi = new Scanner(System.in);
        System.out.println("so km da di : ");
        km = tienTaxi.nextInt();

        if (km == 1) {
            int kmDau = km * 16000;
            System.out.println("thanh toan : " + kmDau);
        } else if (km > 1 && km < 30) {
            int kmGiua = km * 15000;
            System.out.println("thanh toan : " + kmGiua);
        } else {
            int kmCuoi = km * 12000;

            System.out.println("thanh toan : " + kmCuoi);
        }
        tienTaxi.close();
    }
}
