import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        MainMenu();
    }

    private static void MainMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan = -1; //value defaultnya -1

        //main menu
        while(pilihan != 0){
            System.out.println("----------------------------------------");
            System.out.println("  Kalkulator Penghitung Luas dan Volum  ");
            System.out.println("----------------------------------------");
            System.out.println("                  Menu                  ");
            System.out.println("1. Hitung luas bidang");
            System.out.println("2. Hitung Volum");
            System.out.println("0. Tutup Aplikasi");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            
            //case buat pilihan input main menu
            switch(pilihan){
                case 1:
                    LuasBidang(); //forward ke void LuasBidang()
                    break;
                case 2:
                    VolumBidang(); //forward ke void VolumBidang()
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan kalkulator!!");
                    System.exit(0); //close program
                    
                default:
                    System.out.println("Inputan tidak valid!"); //output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

    private static void LuasBidang(){
        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        double sisiP, panjangPP, lebarPP, alas, tinggi, jariJ, hasil; //pake double biar nilainya bisa desimal
        String home;

        //menu luas
        while(pilihan != 0){
            System.out.println("----------------------------------------");
            System.out.println("            Hitung luas Bidang          ");
            System.out.println("----------------------------------------");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Persegi Panjang");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();

            //case buat pilihan input luas bidang
            switch(pilihan){
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("          Anda Memilih Persegi          ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan sisi : ");
                    sisiP = input.nextInt();
                    hasil = sisiP + sisiP;
                    System.out.println("Processing...");
                    System.out.println("Luas persegi adalah " + hasil + " cm^2");

                    //Input random bakal balik ke void LuasBidang()
                    System.out.println("Tekan apa saja untuk kembali ke menu");
                    home = input.next();
                        LuasBidang();
                case 2:
                case 3:
                case 4:
                    System.out.println("----------------------------------------");
                    System.out.println("     Anda Memilih Persegi panjang       ");
                    System.out.println("----------------------------------------");
                    double panjang, lebar, luas;
 
                    System.out.print("Input panjang persegi panjang: ");
                    panjang = input.nextDouble();
                 
                    System.out.print("Input lebar persegi panjang: ");
                    lebar = input.nextDouble();
                
                    luas = panjang * lebar;
                    luas = Math.round(luas*100)/100.0;
                    
                    System.out.println("Luas persegi panjang: "+luas);

                    //Input random bakal balik ke void LuasBidang()
                    System.out.println("Tekan apa saja untuk kembali ke menu");
                    home = input.next();
                    LuasBidang();
                    case 0:
                        System.out.println("Kembali ke menu utama...");
                        MainMenu();
                default:
                    System.out.println("Inputan tidak valid!"); //output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

    private static void VolumBidang(){
        Scanner input = new Scanner(System.in);
        double sisiK, panjangB, lebarB, tinggiB, tinggiT, jariT, hasil;
        int pilihan = -1;
        int home = 0;

        while(pilihan != -1){
            System.out.println("----------------------------------------");
            System.out.println("           Hitung volum Bidang          ");
            System.out.println("----------------------------------------");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");

            switch(pilihan){
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("     Anda Memilih Kubus                 ");
                    System.out.println("----------------------------------------");
                    double sisi;

                    System.out.print("Masukkan Sisi : ");
                    sisi = input.nextDouble();
     
                    hasil = sisi*sisi*sisi;
       
                    System.out.println("Hasil Perhitungannya adalah : " + hasil);

                    


   
                case 2:
                case 3:
                case 0:
                    System.out.println("Kembali ke menu utama...");
                    MainMenu();
                    break;
                default:
                    System.out.println("Inputan tidak valid!"); //output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }

    }
}