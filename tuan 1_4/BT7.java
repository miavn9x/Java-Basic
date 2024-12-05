import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("nhap so gio: ");
        // int hours = scanner.nextInt();

        // System.out.println("Nhap so phut: ");
        // int minutes = scanner.nextInt();

        // System.out.println("Nhap so giay: ");
        // int seconds = scanner.nextInt();

        // int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        // System.out.println("Tong so giay: " + totalSeconds);

        int i=10, s=0;
        while (i>0) {
            if(i % 2 == 0) 
		{
            System.out.println("gia tri i la " + i);    
			s += i; 
             System.out.println("gia tri s la " + s);    
		}
		else 
		{
			if(i > 5) 
			{
				s += 2 * i; //tuc la s = s + 2 * i
			}
		}
		i--; 
	}
	System.out.print("S = " + s); 



    }
}
