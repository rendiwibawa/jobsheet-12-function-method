
package jobsheet_12_function_method;

    
import java.util.Scanner;

public class Latihan5 {

    public static void hasil(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("==========================");
            System.out.println("Nilai terbesar adalah "+a);
        }else if(b>a && b>c){
            System.out.println("==========================");
            System.out.println("Nilai terbesar adalah "+b);
        }else if(c>a && c>b){
            System.out.println("==========================");
            System.out.println("Nilai terbesar adalah "+c);
            
        }
        
    }
    public static void main(String[] args){
        Scanner brn = new Scanner(System.in);
        System.out.print("Masukkan bilangan I = ");
        int a = brn.nextInt();
        System.out.print("Masukkan bilangan II = ");
        int b = brn.nextInt();
        System.out.print("Masukkan bilangan III = ");
        int c = brn.nextInt();
        hasil(a,b,c);
        
        
    }
    
}