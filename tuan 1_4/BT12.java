import java.util.Scanner;
public class BT12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

            System.out.println("nhap so nguyen a:");
            int a = keyboard.nextInt();

            System.out.println("nhap so nguyen b:");
            int b = keyboard.nextInt();
            
            if (a > b) {
                System.out.println("so nguyen lon nhat la a:" + a);
            }
            else if ( a < b) {
                System.out.println(" so nguyen lon nhat b:" + b);
            }
            else {
                System.out.println(" a va b bang nhau khong có gia tri lon nhat:" + b);

                
                
            }
    }
}
