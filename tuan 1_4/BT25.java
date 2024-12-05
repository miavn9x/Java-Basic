import java.util.Scanner;

public class BT25 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        System.out.println("nhap n");
        int n = kp.nextInt();
        int a =1;
        System.out.println("cac uoc co so " + n + " la:");
        for (int i = 1; i <= n; i++)
		{
			if (n%i==0) {
                
                a++;
                System.out.println(a);
            }
        }
    }
}
