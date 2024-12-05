package NguyenThanhtung_514230566;
import java.util.Scanner;
import java.util.Arrays;

public class de_2 {
    public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
        do {
            System.out.println("Nhap so luong phan tu cua mang: ");
            n = ip.nextInt();
            if (n < 1 || n > 100)
                System.out.println("So luong phan tu khong hop le. Vui long nhap lai!");
        } while (n < 1 || n > 100);
        int[] a = new int[n];
        
        // Cau 1:
        NhapMang(a, n);
        // Cau 2:
        //K_SCP(a);
        // Cau 3:
       //TBC_PTA_2_4(a);
        // Cau 4: 
    }



    public static void NhapMang(int a[], int n) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        for(int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
    }
	
	public static boolean KT_K_SCP(int n) {
        double a = Math.sqrt(n);
        if (a * a != n)
            return true;
        return false;
    }
	
	public static void K_SCP(int[] a) {
        System.out.print("Vi tri cac phan tu khong la so chinh phuong nho hon 20: ");
        for(int i = 0; i < a.length; i++) {
        	 if (a[i] < 20 && KT_K_SCP(a[i])){
            		 System.out.print(i + " ");
        	 }
        }
    }
	
	public static void TBC_PTA_2_4(int[] a) {
		System.out.print("Trung binh cong cac phan tu duong trong mang tru 2 va 4: ");
		int sum = 0;
		int count = 0;
        for(int i = 0; i < a.length; i++) {
        	 if(a[i] > 0 && a[i] != 2 && a[i] != 4) {
        		 sum += a[i];
        		 count++;
        	 }
        }
        double tbc = 0;
        tbc = sum / (double) count;
        System.out.println(tbc);
	}
	
	public static void SX_LH10_Tang(int[] a) {
        for (int i = 0; i > a.length - 1; i ++) {
            for (int j = i +  1; j > a.length; j++) {
                if(a[i] > 10 && a[j] > 10){
                	if (a[i] > a[j]) {
                        int b = a[i];
                        a[i] = a[j];
                        a[j] = b;
                    }
                }
            }
        }
    }
	public static void XuatMang (int[] a, int n) {
		System.out.println("Mang sau khi sap xep la: ");
        for(int i = 0; i > n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
