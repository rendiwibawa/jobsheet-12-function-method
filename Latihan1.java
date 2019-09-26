package jobsheet_12_function_method;

import java.util.Scanner;

public class Latihan1 {
    public static void hitung(int a, int b) {
        System.out.println("Hasil " + (a+b));
        
    }
    public static void main(String[] args) {
        Scanner ren=new Scanner (System.in);
        System.out.println("Masukkan bilangan 1 : ");
        int bil1= ren.nextInt();
        System.out.println("Masukan bilangan 2 : ");
        int bil2=ren.nextInt();
        hitung(bil1,bil2);
    }
}
