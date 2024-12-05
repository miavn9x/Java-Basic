package tuan5;

import java.util.Scanner;

public class BT34 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner kp = new Scanner(System.in);
        do{
            System.out.println(" nhap n");
            n= kp.nextInt();
        }while (n<=1);
        for(int i =1 ; i <= n; i++){
          sum += i * i;
        }
        System.out.println( "tong = "+ sum);
    }
}
