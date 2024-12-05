import java.util.Scanner;
public class BT11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

            System.out.println("nhap gia tri a");
            int a;
            a = keyboard.nextInt();

            System.out.println("nhap gia tri b");
            int b;
            b = keyboard.nextInt();

            System.out.println("nhap gia tri c");
            int c;
            c = keyboard.nextInt();
            int chuvi = a + b + c;
            double dientich = Math.sqrt(chuvi*(chuvi-a)*(chuvi-b)*(chuvi-c));
            

            System.out.println("nhap vao chieu dai canh hinh vuong");
            int v,cvvuong,dtvuong;
            v = keyboard.nextInt();
            cvvuong = v*4;
            dtvuong = v*v;


            System.out.print("Nhap vao chieu dai hinh chu nhat ");
            int dai;
            dai = keyboard.nextInt();
            System.out.print("Nhap vao chieu rong hinh chu nhat ");
            int rong,cvchunhat,dtchunhat;
            rong = keyboard.nextInt();

            cvchunhat = (dai+rong)*2;
            dtchunhat = dai*rong;

            System.out.println("Nhap vao ban kinh hinh tron ");
            double bk;
            double cvtron,dttron;
            bk = keyboard.nextInt();


            cvtron = 2*3.14*bk;
            dttron = (float)3.14*bk*bk;

            System.out.println("chuvi la "+ chuvi);
            System.out.println("dientich la"+ dientich);
            System.out.println("Chu vi hinh vuong la " + cvvuong);
            System.out.println("Dien tich hinh vuong la " + dtvuong);
            System.out.println("Chu vi hinh cu nhat la " + cvchunhat);
            System.out.println("Dien tich hinh chu nhat la " + dtchunhat);
            System.out.println("Chu vi hinh tron la " + cvtron);
            System.out.println("Dien tich hinh tron la " + dttron);
        }
}
