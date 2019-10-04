import java.util.Scanner;
public class BilanganKomplek {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca= new Scanner(System.in);
        System.out.println("OPERASI PERKALIAN BILANGAN KOMPLEK");
        System.out.println("1. Soal Utama \n2. Soal Optional");
        
    int pilih; 
        System.out.print("Pilih Soal: ");
        pilih=baca.nextInt(); 
        switch (pilih){ 
            case 1:
        {
            System.out.print("Masukkan Soal : ");
            String soal1 = baca.next();
            String soal2 = baca.next();
            BilKom b1 = new BilKom(soal1);
            BilKom b2 = new BilKom(soal2);
            BilKom hasilkali;
            hasilkali = b1.Kali(b2);
            System.out.print("Hasil : ");
            hasilkali.Info();
            System.out.println("");
            break;
        }
            case 2:
        {
            System.out.print("Masukkan Soal : ");
            String soal1 = baca.next();
            String soal2 = baca.next();
            String soal3 = baca.next();
            BilKom b1 = new BilKom(soal1);
            BilKom b2 = new BilKom(soal2);
            BilKom b3 = new BilKom(soal3);
            BilKom hasilkali;
            hasilkali = b1.Kali(b2,b3);
            System.out.print("Hasil : ");
            hasilkali.Info();
            System.out.println("");
            break;    
            }
        }   
    }
}

class BilKom {
    private int real;
    private int imajiner;
    
    public BilKom(){
        this.real=0;  
        this.imajiner=0;
    }
    public BilKom(String soal){
        if(soal.length()==2){
            String ambilreal = soal.substring(0,1);
            int imajiner1 = Integer.parseInt(ambilreal);
            this.imajiner = imajiner1;
}
        else if(soal.length()==4){
            String ambilreal = soal.substring(0,1);
            String ambilimajiner = soal.substring(1,3);
            int real1 = Integer.parseInt(ambilreal);
            int imajiner1 = Integer.parseInt(ambilimajiner);
            this.real = real1;
            this.imajiner = imajiner1;
        }
        else if(soal.length()==6){
            String ambilreal = soal.substring(0,1);
            String ambilimajiner = soal.substring(1,5);
            int real1 = Integer.parseInt(ambilreal);
            int imajiner1 = Integer.parseInt(ambilimajiner);
            this.real = real1;
            this.imajiner = imajiner1;
        }
    }
    public void Info(){
        if(this.real==0)
            System.out.print(this.imajiner+"i");
        else if (this.imajiner==0)
            System.out.print(this.real);
        else if(this.imajiner<0)
            System.out.print(this.real+"+("+this.imajiner+"i");
            else System.out.print(this.real+"+"+this.imajiner+"i");
    } 
            
        public BilKom Kali(BilKom bil1){
            BilKom hasilkali = new BilKom();
            hasilkali.real = (this.real*bil1.real)+(this.imajiner*bil1.imajiner*(-1));
            hasilkali.imajiner = (this.real*bil1.imajiner)+(this.imajiner*bil1.real);
            return hasilkali;
        }
        public BilKom Kali(BilKom bil1,BilKom bil2){
            BilKom hasilkali = new BilKom();
            BilKom bil3;
            bil3 = bil1.Kali(bil2);
            hasilkali.real = (this.real*bil3.real)+(this.imajiner*bil3.imajiner*(-1));
            hasilkali.imajiner = (this.real*bil3.imajiner)+(this.imajiner*bil3.real);
            return hasilkali;
       }
        
    }
         
            
    
    
   