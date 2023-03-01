import java.util.Scanner;
import java.util.Locale;

public class Challenge_1_Faris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi Variable
        double panjang, lebar, luas;

        //Perhitungan
        System.out.println("----------------------------------------");
        System.out.println("      Anda Memilih Persegi Panjang      ");
        System.out.println("----------------------------------------");
     
        System.out.print("Input panjang persegi: ");
        panjang = input.nextDouble();
         
        System.out.print("Input lebar persegi: ");
        lebar = input.nextDouble();
        
        luas = panjang * lebar;
        luas = Math.round(luas*100)/100.0;
            
        System.out.println("Luas persegi panjang: "+luas);

        //mencari volume kubus
        System.out.println("== Program Perhitungan Volume Kubus ==");
        // Rumusnya:
        double sisi, hasil;

        //Perhitungan
       
        System.out.print("Masukkan Sisi : ");
             sisi = input.nextDouble();
     
        hasil = sisi*sisi*sisi;
       
        System.out.println("Hasil Perhitungannya adalah : " + hasil);

    }
    
}