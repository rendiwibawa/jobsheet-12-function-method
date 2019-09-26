package jobsheet_12_function_method;

import java.util.Scanner;
public class Latihan4 {

    public static void method(double a, double b){
        System.out.println("Kecepatan : " + (a/b) + " km/jam ");
    }
    public static void main(String[] args) {
        int jarak;
        int waktu;
        Scanner brn = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        jarak = brn.nextInt();
        System.out.print("Masukkan waktu tempuhnya:");
        waktu = brn.nextInt();
        method(jarak,waktu);
                
    }
    
}