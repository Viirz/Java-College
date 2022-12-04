package TugasDikumpulin;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NewStudiKasus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hargaEconomy = 4000, hargaBusiness = 7000, hargaFirst = 10000, hargaTiket = 0, kondisi = 0;
        String jauhRute = "abc";

        System.out.println("==================================================");
        System.out.println("                FILKOM RAIL EXPRESS               ");
        System.out.println("        PROGRAM PEMESANAN TIKET KERETA            ");
        System.out.println("==================================================");
        System.out.println("Silahkan masukkan data berikut");
        System.out.print("Nama\t\t\t\t\t: ");
        String nama = in.nextLine();
        System.out.print("NIK\t\t\t\t\t\t: ");
        String nik = in.nextLine();
        System.out.print("Alamat\t\t\t\t\t: ");
        String alamat = in.nextLine();
        System.out.print("Nomor Telepon\t\t\t: ");
        String notelp = in.nextLine();
        System.out.println("==================================================");
        System.out.println("             Silahkan pilih tiket anda            ");
        System.out.println("==================================================");
        System.out.println("List stasiun tersedia : ");
        System.out.println("1.Malang        4.Semarang     7.Serang");
        System.out.println("2.Surabaya      5.Bandung");
        System.out.println("3.Yogyakarta    6.Jakarta");
        System.out.printf("\nJenis Tiket : \n%s\n%s\n%s\n\n", "1. Economy Class", "2. Business Class", "3. First Class");

        System.out.print("Tanggal Keberangkatan\t: ");
        String tanggal = in.nextLine();
        System.out.print("Stasiun Asal\t\t\t: ");
        String stasiunAwal = in.nextLine();
        System.out.print("Stasiun Tujuan\t\t\t: ");
        String stasiunAkhir = in.nextLine();
        System.out.print("Jenis Tiket\t\t\t\t: ");
        int jenisTiket = in.nextInt();
        System.out.print("Jumlah Tiket\t\t\t: ");
        int jumlahTiket = in.nextInt();
        System.out.print("Nominal Pembayaran\t\t: ");
        int bayar = in.nextInt();

        System.out.println("\n\n==================================================");
        if (stasiunAwal.equals("Malang")){
            if (jenisTiket==1){
                switch (stasiunAkhir){
                    case "Surabaya" :
                        hargaTiket=hargaEconomy*10*jumlahTiket; jauhRute = "(100km)"; break;
                    case "Yogyakarta" :
                        hargaTiket = hargaEconomy*40*jumlahTiket; jauhRute = "(400km)"; break;
                    case "Serang" :
                        hargaTiket=hargaEconomy*100*jumlahTiket; jauhRute = "(1000km)"; break;
                    default :
                        kondisi = 1;
                }
            }
            else if (jenisTiket==2){
                switch (stasiunAkhir){
                    case "Surabaya" :
                        hargaTiket=hargaBusiness*10*jumlahTiket; jauhRute = "(100km)"; break;
                    case "Yogyakarta" :
                        hargaTiket=hargaBusiness*40*jumlahTiket; jauhRute = "(400km)"; break;
                    case "Serang" :
                        hargaTiket=hargaBusiness*100*jumlahTiket; jauhRute = "(1000km)"; break;
                    default :
                        kondisi = 1;
                }
            }
            else if (jenisTiket==3){
                switch (stasiunAkhir){
                    case "Surabaya" :
                        hargaTiket=hargaFirst*10*jumlahTiket; jauhRute = "(100km)"; break;
                    case "Yogyakarta" :
                        hargaTiket=hargaFirst*40*jumlahTiket; jauhRute = "(400km)"; break;
                    case "Serang" :
                        hargaTiket=hargaFirst*100*jumlahTiket; jauhRute = "(1000km)"; break;
                    default :
                        kondisi = 1;
                }
            }
            else {
                kondisi = 1;
            }
        }
        else if (stasiunAwal.equals("Surabaya")){
            if (jenisTiket==1){
                switch (stasiunAkhir){
                    case "Semarang" :
                        hargaTiket=hargaEconomy*35*jumlahTiket; jauhRute = "(350km)"; break;
                    case "Bandung" :
                        hargaTiket=hargaEconomy*70*jumlahTiket; jauhRute = "(700km)"; break;
                    default :
                        kondisi = 1;
                }
            }
            else if (jenisTiket==2){
                switch (stasiunAkhir){
                    case "Semarang" :
                        hargaTiket=hargaBusiness*35*jumlahTiket; jauhRute = "(350km)"; break;
                    case "Bandung" :
                        hargaTiket=hargaBusiness*70*jumlahTiket; jauhRute = "(700km)"; break;
                    default :
                        kondisi = 1;
                }
            }
            else if (jenisTiket==3){
                switch (stasiunAkhir){
                    case "Semarang" :
                        hargaTiket=hargaFirst*35*jumlahTiket; jauhRute = "(350km)"; break;
                    case "Bandung" :
                        hargaTiket=hargaFirst*70*jumlahTiket; jauhRute = "(700km)"; break;
                    default :
                        kondisi = 1;
                }
            }
            else {
                kondisi = 1;
            }
        }
        else if (stasiunAwal.equals("Yogyakarta") && stasiunAkhir.equals("Jakarta")){
                if (jenisTiket==1) {
                    hargaTiket = hargaEconomy * 50 * jumlahTiket;
                    jauhRute = "(500km)";
                }
                else if (jenisTiket==2) {
                    hargaTiket = hargaBusiness * 50 * jumlahTiket;
                    jauhRute = "(500km)";
                }
                else if (jenisTiket==3) {
                    hargaTiket = hargaFirst * 50 * jumlahTiket;
                    jauhRute = "(500km)";
                }
                else {
                    kondisi = 1;
                }
        }
        else {
            kondisi = 1;
        }

        int kembalian = bayar-hargaTiket;
        NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
        String bayarString = titik.format(bayar);
        String hargaString = titik.format(hargaTiket);
        String kembalianString = titik.format(kembalian);

        if (kondisi==0 && bayar>=hargaTiket){
            System.out.printf("%37s\n", "Pemesanan Tiket Berhasil");
            System.out.println("==================================================");
            System.out.printf("%33s\n", "DETAIL PEMESANAN");
            System.out.println("==================================================");

            System.out.println("Nama\t\t\t\t\t: " + nama);
            System.out.println("NIK\t\t\t\t\t\t: " + nik);
            System.out.println("Alamat\t\t\t\t\t: " + alamat);
            System.out.println("Nomor Telepon\t\t\t: " + notelp);
            System.out.println("Tanggal Keberangkatan\t: " + tanggal);
            System.out.println("Rute\t\t\t\t\t: " +stasiunAwal + "-" + stasiunAkhir + jauhRute);
            System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

            System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
            System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
            System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
        }
        else if (kondisi==1){
            System.out.println("           Maaf, rute tidak ditemukan               ");
        }
        else {
            System.out.println("           Maaf, uang anda tidak mencukupi        ");
        }
        System.out.println("==================================================");
    }
}
