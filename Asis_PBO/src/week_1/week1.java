/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_1;

public class week1 {
    public static void main(String[] args){
        
        System.out.println(perkalian(3,5));
        System.out.println(hai("tata"));
    }
    public static int perkalian(int a,int b){
        return a*b;
    }
    public String hai(String nama){
        return "halo"+nama;
    }

}

//modifier
//tempat modifier(class,method,variable)
//jenis modifier(private= cuma bisa diakses oleh satu scoop,public(default),protected=satu file,static=kalo tanpa static harus di instansiasi= membuat objek dg menginstansiasikan sebuah class)