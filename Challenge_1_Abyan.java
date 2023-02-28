import java.util.Scanner;
public class Challenge_1_Abyan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float sisiP, hasil;

        System.out.println("----------------------------------------");
        System.out.println("          Anda Memilih Persegi          ");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan sisi : ");
        sisiP = input.nextInt();
        hasil = sisiP + sisiP;
        System.out.println("Processing...");
        System.out.println("Luas persegi adalah " + hasil + " cm^2");

    }
}
