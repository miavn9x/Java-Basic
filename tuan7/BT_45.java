package tuan7;

import java.util.Scanner;

public class BT_45 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap r: ");
        double r = kb.nextDouble();
        tinhcv(r);
        tinhbk(r);
    }
    public static void tinhcv(double r) {
        double cv = 2*Math.PI*r;
        System.out.println("chu vi ht: "+cv);
    }
    public static void tinhbk( double r) {
        double dt = Math.PI*Math.pow(r,2);
        System.out.println("chu vi: "+dt);
    }

}