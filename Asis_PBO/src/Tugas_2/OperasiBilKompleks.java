
package Tugas_2;

public class OperasiBilKompleks {
   private int real;  //atribut dengan tipe private
   private int imajiner; 
   
   public OperasiBilKompleks(){
       this.real=0;  //menginisialisasi nilai real = 0
       this.imajiner=0; //menginisialisasi nilai imajiner = 0
}
   public OperasiBilKompleks(int r, int i){
       this.real=r; //menginisialisasi nilai real = r
       this.imajiner=i; //menginisialisasi nilai imajiner = i
   }
   public void setReal(int r){ //memasukan nilai real
       this.real=r;  //menginisialisasi nilai real
   }
   public int getReal(){ //untuk mendapatkan nilai real
       return this.real; //mengembalikan nilai real
   }
   public void setImajiner(int i){ //memasukkan nilai imajiner
       this.imajiner=i; //menginisialisasi nilai imajiner
   }
   public int getImajiner(){ //untuk mendapatkan nilai imajiner
       return this.imajiner; //mengembalikan nilai imajiner
   }
   public void info(){ //untuk menampilkan bilangan kompleks yang akan dioperasikan
      if (getReal()==0)
          System.out.print("("+getImajiner()+"i)");
      else if (getImajiner()==0)
          System.out.print("("+getReal()+")");
      else if (getImajiner()<0)
          System.out.print("("+getReal()+"+("+getImajiner()+"i))");
      else 
           System.out.print("("+getReal()+"+"+getImajiner()+"i)");
   }
   public OperasiBilKompleks Kali(OperasiBilKompleks b){
       OperasiBilKompleks hasilkalibk = new OperasiBilKompleks(); //membuat objek hasilkalibk
       hasilkalibk.real = (getReal()*b.real)+(getImajiner()*b.imajiner*(-1)); //rumus perkalian untuk menghasilkan bilangan real
       hasilkalibk.imajiner = (getReal()*b.imajiner)+(getImajiner()*b.real); //rumus perkalian untuk menghasilkan bilangan imajiner
       return hasilkalibk; //
   }
   public OperasiBilKompleks Kali1(OperasiBilKompleks b1, OperasiBilKompleks b2){
       OperasiBilKompleks hasilkalibk1 = new OperasiBilKompleks(); //membuat objek hasilkalibk1
       hasilkalibk1= b2.Kali(b1); 
       OperasiBilKompleks hasilkalibk2 = new OperasiBilKompleks(); //membuat objek hasilkalibk2
       hasilkalibk2.real = (hasilkalibk1.real*getReal())+(hasilkalibk1.imajiner*getImajiner()*(-1)); //rumus perkalian untuk menghasilkan bilangan real
       hasilkalibk2.imajiner = (hasilkalibk1.real*getImajiner())+(hasilkalibk1.imajiner*getReal()); //rumus perkalian untuk menghasilkan bilangan imajiner
       return hasilkalibk2; //
   }
}

