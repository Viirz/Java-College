package nyoba;
import java.util.Scanner;

public class PemakaianListrikSederhana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Penghitung Pemakaian Listrik Sederhana");
        System.out.print("Masukkan nama : ");
         String nama = in.nextLine();
        System.out.print("Kelurahan : ");
         String kelurahan = in.nextLine();
        System.out.print("Masukkan posisi awal Kwh meter : ");
         int awalKwh = in.nextInt();
        System.out.print("Masukkan posisi akhir Kwh meter : ");
         int akhirKwh = in.nextInt();
        System.out.print("Masukkan biaya beban saat ini : ");
         int biayaBeban = in.nextInt();
        System.out.print("Masukkan PPJ (dalam persen) : " );
         int ppj = in.nextInt();

        int hitungPemakaian = akhirKwh-awalKwh ;
        int hitungTarif = hitungPemakaian*biayaBeban ;
        int hitungPPJ = hitungTarif/ppj ;
        int hitungTotal = hitungTarif+hitungPPJ ;


        System.out.println("====================PLN JAVA====================");
        System.out.println ("Nama = " + nama);
        System.out.println ("Kelurahan = " + kelurahan);
        System.out.println ("Pemakaian bulan ini = " + hitungPemakaian);
        System.out.println ("Tarif Listrik = " + hitungTarif);
        System.out.println ("PPJ 10% = " + hitungPPJ);
        System.out.println ("Total Bayar = " + hitungTotal);



    }
}
