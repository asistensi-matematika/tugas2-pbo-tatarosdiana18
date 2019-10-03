
package Tugas_1;

import java.util.Scanner;
public class Tabelmultiplikasi {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan angka= "); //static method
        try{
        int angka = in.nextInt();
        
        if(angka > 0){
            
        for(int i =1; i <= 10; i++){
            System.out.println(angka+" x "+i+" = "+angka*i);
        }
        }
        else 
       System.out.println("0");
        }
        catch (Exception e){
            System.out.println("input tidak boleh huruf");
        }
}
}