/**
Nama 1: Virgananta Saputra (NIM 225150201111028)
Nama 2: Muhammad Nadhil Luthfirrahman (NIM 225150207111049)
Tanggung jawab 1: mengerjakan soal c, membuat codingan, format file, dan diskusi soal d dan e
Tanggung jawab 2: mengerjakan soal a dan b, membuat pseudocode, membuat flowchart, dan diskusi soal d dan e
 **/

package Tugas;
import java.util.Scanner;

public class T2_225150201111028_VirganantaSaputra_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kiriman = input.nextLine();
        double berat = input.nextDouble();
        long pembulatanberat = Math.round(berat);
        double panjang = input.nextDouble();
        double lebar = input.nextDouble();
        double tinggi = input.nextDouble();
        input.nextLine();
        String layanan = input.nextLine();

        double volume = (panjang * lebar * tinggi) / 3000;
        double palingberat = Math.max(volume, pembulatanberat);
        double harga = palingberat * 100_000;

        if (layanan.equals("ANTARSENDIRI"))
            System.out.printf("%s DITERIMA\n", kiriman);
        else
            System.out.printf("%s DIAMBIL DAN DITERIMA\n", kiriman);
        if (pembulatanberat >= volume)
            System.out.println("BIAYA_BERAT");
        else
            System.out.println("BIAYA_VOLUMENTRIK");
        if (layanan.equals("PICKUP")) {
            harga += 4000;
        }
        System.out.println("BERAT_PEMBULATAN " + pembulatanberat);
        System.out.printf("BERAT_VOLUMENTRIK %.2f\n", volume);
        System.out.printf("TOTAL %.0f", harga);
    }
}
