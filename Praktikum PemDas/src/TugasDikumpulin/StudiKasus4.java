package TugasDikumpulin;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StudiKasus4 {
    public static void main (String[] args){
        System.out.println("==================================================");
        System.out.println("                FILKOM RAIL EXPRESS               ");
        System.out.println("        PROGRAM PEMESANAN TIKET KERETA            ");
        System.out.println("==================================================");
        Scanner nt = new Scanner(System.in);
        String[] riwayat = new String[5];
        int i = 0; int j = 0;

        while (true) {
            printMenu();
            String pilihan = nt.nextLine();

            if (pilihan.equals("")) {
                break;
            }
            if (pilihan.equals("2")) {
                printListTiket();
            }
            else if (pilihan.equals("3")) {
                printListStasiun();
            }
            else if (pilihan.equals("4")) {
                printriwayat(riwayat, j);
            }
            else if (pilihan.equals("5")) {
                break;
            }
            else if (pilihan.equals("1")) {
                System.out.println("\nSilahkan masukkan data berikut");
                System.out.print("Nama\t\t\t\t\t: ");
                String nama = nt.nextLine();
                System.out.print("NIK\t\t\t\t\t\t: ");
                String nik = nt.nextLine();
                System.out.print("Alamat\t\t\t\t\t: ");
                String alamat = nt.nextLine();
                System.out.print("Nomor Telepon\t\t\t: ");
                String notelp = nt.nextLine();
                System.out.println("==================================================");
                System.out.println("             Silahkan pilih tiket anda            ");
                System.out.println("==================================================");
                System.out.println("List stasiun tersedia : ");
                System.out.println("1.Malang        4.Semarang     7.Serang");
                System.out.println("2.Surabaya      5.Bandung");
                System.out.println("3.Yogyakarta    6.Jakarta");
                System.out.printf("\nJenis Tiket : \n%s\n%s\n%s\n\n", "1. Economy Class", "2. Business Class", "3. First Class");

                System.out.print("Tanggal Keberangkatan\t: ");
                String tanggal = nt.nextLine();
                System.out.print("Stasiun Asal\t\t\t: ");
                String stasiunAwal = nt.nextLine();
                System.out.print("Stasiun Tujuan\t\t\t: ");
                String stasiunAkhir = nt.nextLine();
                System.out.print("Jenis Tiket\t\t\t\t: ");
                int jenisTiket = nt.nextInt();
                System.out.print("Jumlah Tiket\t\t\t: ");
                int jumlahTiket = nt.nextInt();
                System.out.print("Nominal Pembayaran\t\t: ");
                int bayar = nt.nextInt();
                nt.nextLine();
                int jauhRute = hitungJarak(stasiunAwal,stasiunAkhir);
                int hargaTiket = hitungHarga(jauhRute,jenisTiket);
                hargaTiket = hitungTotal(hargaTiket,jumlahTiket);
                int kembalian = hitungKembalian(bayar, hargaTiket);

                NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                String bayarString = titik.format(bayar);
                String hargaString = titik.format(hargaTiket);
                String kembalianString = titik.format(kembalian);

                if (hargaTiket==0){
                    System.out.println("\n==================================================");
                    System.out.println("           Maaf, rute tidak ditemukan               ");
                    System.out.println("==================================================\n");
                }
                else if (bayar>=hargaTiket){
                    System.out.println("\n==================================================");
                    System.out.printf("%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: " + stasiunAwal + "-" + stasiunAkhir + " (" + jauhRute + "km)");
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-\n");

                    String riwayatSementara = printID(stasiunAwal,stasiunAkhir,tanggal);
                    tambahriwayat(riwayatSementara, riwayat, i);
                    j++; i++;
                }
                else {
                    System.out.println("\n==================================================");
                    System.out.print("           Maaf, uang anda tidak mencukupi        ");
                    System.out.println("\n==================================================");
                }
            }
        }
    }
    static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Beli Tiket");
        System.out.println("2. Lihat Jenis Tiket");
        System.out.println("3. List Stasiun");
        System.out.println("4. Riwayat Pemesanan");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan anda : ");
    }
    static void printListStasiun() {
        System.out.println("List stasiun tersedia : ");
        System.out.println("1.Malang        4.Semarang     7.Serang");
        System.out.println("2.Surabaya      5.Bandung");
        System.out.println("3.Yogyakarta    6.Jakarta\n");
    }
    static void printListTiket() {
        System.out.printf("Jenis Tiket : \n%s\n%s\n%s\n\n", "1. Economy Class", "2. Business Class", "3. First Class");
    }
    static int hitungJarak(String stasiunAwal, String stasiunAkhir) {
        int jauhRute = 0;
        if (stasiunAwal.equals("Malang")) {
            switch (stasiunAkhir) {
                case "Surabaya":
                    jauhRute = 100;
                    break;
                case "Yogyakarta":
                    jauhRute = 400;
                    break;
                case "Serang":
                    jauhRute = 1000;
                    break;
            }
        } else if (stasiunAwal.equals("Surabaya")) {
            switch (stasiunAkhir) {
                case "Semarang":
                    jauhRute = 350;
                    break;
                case "Bandung":
                    jauhRute = 700;
                    break;
            }
        } else if (stasiunAwal.equals("Yogyakarta")) {
            switch (stasiunAkhir) {
                case "Jakarta":
                    jauhRute = 500;
                    break;
            }
        }
        return jauhRute;
    }
    static int hitungHarga(int jauhRute, int tipekelas){
        int hargaTiket = 0;
        if (tipekelas==1)
            hargaTiket = jauhRute*400;
        if (tipekelas==2)
            hargaTiket = jauhRute*700;
        if (tipekelas==3)
            hargaTiket = jauhRute*1000;
        return hargaTiket;
    }
    static int hitungTotal(int hargaTiket, int jumlahTiket){
        return hargaTiket*jumlahTiket;
    }
    static int hitungKembalian(int bayar, int hargaTiket){
        return bayar - hargaTiket;
    }
    static String printID(String stasiunAwal, String stasiunAkhir,String tanggal){
        String riwayatID = "";
        if (stasiunAwal.equals("Malang"))
            riwayatID = "MLG-";
        else if (stasiunAwal.equals("Surabaya"))
            riwayatID = "SBY-";
        else if (stasiunAwal.equals("Yogyakarta"))
            riwayatID = "YOG-";

        if (stasiunAkhir.equals("Surabaya"))
            riwayatID += "SBY : ";
        else if (stasiunAkhir.equals("Yogyakarta"))
            riwayatID += "YOG : ";
        else if (stasiunAkhir.equals("Serang"))
            riwayatID += "SRG : ";
        else if (stasiunAkhir.equals("Semarang"))
            riwayatID += "SEM : ";
        else if (stasiunAkhir.equals("Bandung"))
            riwayatID += "BND : ";
        else if (stasiunAkhir.equals("Jakarta"))
            riwayatID += "JKT : ";

        riwayatID += tanggal;
        return riwayatID;
    }
    static String[] tambahriwayat(String riwayatSementara,String[] riwayat, int i){
        if (i<5)
            riwayat[i] = riwayatSementara;
        return riwayat;
    }
    static void printriwayat(String[] riwayat, int j){
        System.out.println("Riwayat Pembelian");
        if (j>5){
            j=5;
        } if (j==0){
            System.out.println("(Riwayat anda kosong)\n" +
                    "");
        } else {
            for (int i = 0; i < j; i++) {
                System.out.println((i + 1) + ". " + riwayat[i]);
            }
            System.out.println("");
        }
    }
}
