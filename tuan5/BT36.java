package tuan5;

import java.util.Scanner;

public class BT36 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        int count = 1;
        Scanner kp = new Scanner(System.in);
        do{
            System.out.println(" nhap n");
            n =kp.nextInt();
        }while (n <=0);
        for(int i =1 ; i <= n; i++){
            count *= i;
            sum += count;
            
        } System.out.println("tong sum:"+ sum);
    
    }
}
