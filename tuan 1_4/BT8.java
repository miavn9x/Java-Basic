
import java.util.Scanner;
public class BT8 {
    public static void main(String[] args) {
        double N;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Thoi Gian Nhap Vao:");
        N = Scanner.nextDouble();
        double hours = (double) N/3600;
        double minutes = (double) N/60;
        double seconds = N;
        System.out.println(N +"N ="+ hours +"hours");
    }
}
