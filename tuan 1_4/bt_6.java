import java.util.Scanner;

public class bt_6 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("nhập độ F:");
        int doF = keyboard.nextInt();
        double doC = 5*1.0/9* (doF -32);
        System.out.println("DO C = %.2f: "+doC);
        /*System.out.println(doF + " do F = " + doC + " do C");*/

    }
    
}
