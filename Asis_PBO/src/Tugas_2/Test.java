
package Tugas_2;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println("OPERASI PERKALIAN BILANGAN KOMPLEKS");
        System.out.println("Pilihan : \n1. Soal Utama \n2. Soal Optional");
    int pilih; 
    System.out.print("Pilih Soal: ");
    pilih=input.nextInt(); //untuk menginput int pilih
    switch (pilih){ 
        case 1:
        {
        OperasiBilKompleks b1 = new OperasiBilKompleks(0,4); //membuat objek b1
        OperasiBilKompleks b2 = new OperasiBilKompleks(3,-7); //membuat objek b2
        OperasiBilKompleks b3 = new OperasiBilKompleks(7,6); //membuat objek b3
        OperasiBilKompleks b4 = new OperasiBilKompleks(7,6); //membuat objek b4
            System.out.print("\nSoal: ");
            b1.info(); //menampilkan b1
            b2.info(); //menampilkan b2
            OperasiBilKompleks b5; 
            b5 = b1.Kali(b2); 
            System.out.print("\nHasil= ");
            b5.info(); //menampilkan b5
            System.out.print("\n\nSoal: ");
            b3.info(); //menampilkan b3
            b4.info(); //menampilkan b4
            OperasiBilKompleks b6; 
            b6 = b3.Kali(b4);
            System.out.print("\nHasil= ");
            b6.info(); //menampilkan b6
            System.out.println("");
            break;
        }
        case 2:
        {
            OperasiBilKompleks b1 = new OperasiBilKompleks(0,3);
            OperasiBilKompleks b2 = new OperasiBilKompleks(0,3);
            OperasiBilKompleks b3 = new OperasiBilKompleks(0,3);
            System.out.print("\nSoal: ");
            b1.info();
            b2.info();
            b3.info();
            OperasiBilKompleks b4;
            b4= b1.Kali1(b2, b3);
            System.out.print("\nHasil= ");
            b4.info();
            System.out.println("");
            break;
        }
     
    } 
    }
    }
    


