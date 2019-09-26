package jobsheet_12_function_method;

import java.util.Scanner;

public class kalkulator {

static int penjumlahan (int sisi,int sisi2){
int hasil = sisi+sisi2;
return hasil;}
static int pengurangan (int sisi,int sisi2){
int hasil = sisi-sisi2;
return hasil;}
static int pembagian (int sisi,int sisi2){
int hasil = sisi/sisi2;
return hasil;}
static int perkalian (int sisi,int sisi2 ){
int hasil = sisi*sisi2;
return hasil;}
static double sisahasilbagi (int sisi,int sisi2){
if(sisi>sisi2){
    double hasil = sisi%sisi2;
return hasil;}return 0;}



    public static void main(String[] args) {
    Scanner ren= new Scanner(System.in);
        int pilih,angka,angka1,angka2,angka3,angka4,angka5,angka6,angka7,angka8;
         System.out.println("================LANJUT MATEMATIKA===================");
         System.out.println("1.pembagian (:)");
         System.out.println("2.pengurangan (-)");
         System.out.println("3.perkalian (*)");
         System.out.println("4.sisa hasil bagi (%)");
         System.out.println("5.penjumlahan (+)");
         System.out.println("=====PILIH OPERATOR YANG AKAN ANDA GUNAKAN BOSS=====");
       pilih=ren.nextInt();
         if(pilih==1){
             System.out.println("================================================");
         System.out.println("massukan nilai untuk pembagian ");
        angka=ren.nextInt();
        angka1=ren.nextInt();
        System.out.println("hasil pembagian: "+ pembagian(angka,angka1));
        System.out.println("================SELESAI:)===================");
       
         pilih=ren.nextInt();
         }else {if(pilih==2){
             System.out.println("================================================");
        System.out.println("masukan nilai pengurangan ");
        angka2=ren.nextInt();
        angka3=ren.nextInt();
        System.out.println("hasil pengurangan: "+ pengurangan(angka2,angka3));
         System.out.println("================SELESAI:)===================");
         
         pilih=ren.nextInt();
         }else{ if(pilih==3){
             System.out.println("================================================");
        System.out.println("massukan perkalian");
        angka4=ren.nextInt();
        angka5=ren.nextInt();
        System.out.println("hasil perkalian: "+ perkalian(angka4,angka5));
         System.out.println("================SELESAI:)===================");
   
         pilih=ren.nextInt();
         }else{ if(pilih==4){
             System.out.println("================================================");
        System.out.println("massukan nilai hasil bagi");
        angka6=ren.nextInt();
        angka7=ren.nextInt();
        System.out.println("hasil sisahasilbagi: "+ sisahasilbagi(angka6,angka7));
             System.out.println("==================SELESAI:)==================");
    
          pilih=ren.nextInt();
         }else{ if(pilih==5){
             System.out.println("================================================");
        System.out.println("massukan nilai PENJUMLAHAN");
        angka7=ren.nextInt();
        angka8=ren.nextInt();
        System.out.println("hasil penjumlahan: "+ penjumlahan(angka7,angka8));
    }
             }
           }        
         }
       }
    }
  }
    


