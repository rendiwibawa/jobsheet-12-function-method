package jobsheet_12_function_method;      //membuat method dan memanggilnya
public class Jobsheet_12_function_method {
    public static void main(String[] args) {
        System.out.println("hasil dari luas persegi"+persegi());
        System.out.println("hasil dari persegi panjang"+persegipanjang());
        System.out.println("hasil dari luas lingkaran"+luaslingkaran(3.14 , 4.0));//cara memanggil method dengan parameter yaitu memanggil nila dari variable yang telah di inputkan
    }
    private static double persegi(){     //saya membuat b=method persegi tanpa parameter
    int s=10;
    double hasil=s*s;
    return hasil;
    }
    private static double persegipanjang() {//saya membuat method persehi panjang tanpa parrameter
        int p=10;
        int l=7;
        double hasil=p*l;
        return hasil;
    }
    private static double luaslingkaran(double phi , double r) {//saya membuat method luas lingkarang menggunakan parameter
        phi = 3.14;
        r = 4.0;
        double hasil=phi*r*r;
        return hasil;
        
    }
}
