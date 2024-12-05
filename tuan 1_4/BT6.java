import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        float F;

        Scanner inputDo = new Scanner(System.in);
        System.out.println("Nhap nhiet do F");
        F = inputDo.nextFloat();

        double C = 5 * 1.0 / 9 * (F - 32);
        System.out.printf("DO C = %.2f: ", C);

    }
}