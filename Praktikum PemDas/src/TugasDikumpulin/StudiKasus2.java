package TugasDikumpulin;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.printf("%34s\n", "FILKOM RAIL EXPRESS");
        System.out.printf("%40s\n", "PROGRAM PEMESANAN TIKET KERETA");
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
        System.out.print("Silahkan pilih tiket anda\n");
        System.out.println("==================================================");
        System.out.println("List stasiun tersedia : ");
        System.out.printf("%s\t\t%s\t\t%s\n", "1.Malang", "4.Semarang", "7.Serang");
        System.out.printf("%s\t\t%s\n", "2.Surabaya", "5.Bandung");
        System.out.printf("%s\t%s\n", "3.Yogyakarta", "6.Jakarta");

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


        int hargaEconomy = 4000;
        int hargaBusiness = 7000;
        int hargaFirst = 10000;

        if (jenisTiket==1) {
            if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Surabaya")) {
                String jauhRute = "(100 km)";
                int hargaTiket = 10 * hargaEconomy * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Surabaya " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Yogyakarta")) {
                String jauhRute = "(400 km)";
                int hargaTiket = 40 * hargaEconomy * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Yogyakarta " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Serang")) {
                String jauhRute = "(1000 km)";
                int hargaTiket = 100 * hargaEconomy * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Serang " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Surabaya") && stasiunAkhir.equals("Semarang")) {
                String jauhRute = "(350 km)";
                int hargaTiket = 35 * hargaEconomy * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Surabaya - Semarang " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Surabaya") && stasiunAkhir.equals("Bandung")) {
                String jauhRute = "(700 km)";
                int hargaTiket = 70 * hargaEconomy * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Surabaya - Bandung " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Yogyakarta") && stasiunAkhir.equals("Jakarta")) {
                String jauhRute = "(500 km)";
                int hargaTiket = 50 * hargaEconomy * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Yogyakarta - Jakarta " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else {
                System.out.print("\n\n==================================================");
                System.out.printf("\n%30s\n", "Maaf, rute tidak ditemukan");
                System.out.println("==================================================");
            }
        }

        else if (jenisTiket==2) {
            if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Surabaya")) {
                String jauhRute = "(100 km)";
                int hargaTiket = 10 * hargaBusiness * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Surabaya " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Yogyakarta")) {
                String jauhRute = "(400 km)";
                int hargaTiket = 40 * hargaBusiness * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Yogyakarta " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Serang")) {
                String jauhRute = "(1000 km)";
                int hargaTiket = 100 * hargaBusiness * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Serang " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Surabaya") && stasiunAkhir.equals("Semarang")) {
                String jauhRute = "(350 km)";
                int hargaTiket = 35 * hargaBusiness * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Surabaya - Semarang " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Surabaya") && stasiunAkhir.equals("Bandung")) {
                String jauhRute = "(700 km)";
                int hargaTiket = 70 * hargaBusiness * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Surabaya - Bandung " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Yogyakarta") && stasiunAkhir.equals("Jakarta")) {
                String jauhRute = "(500 km)";
                int hargaTiket = 50 * hargaBusiness * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Yogyakarta - Jakarta " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else {
                System.out.print("\n\n==================================================");
                System.out.printf("\n%30s\n", "Maaf, rute tidak ditemukan");
                System.out.println("==================================================");
            }
        }
        else if (jenisTiket==3) {
            if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Surabaya")) {
                String jauhRute = "(100 km)";
                int hargaTiket = 10 * hargaFirst * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Surabaya " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Yogyakarta")) {
                String jauhRute = "(400 km)";
                int hargaTiket = 40 * hargaFirst * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Yogyakarta " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Malang") && stasiunAkhir.equals("Serang")) {
                String jauhRute = "(1000 km)";
                int hargaTiket = 100 * hargaFirst * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Malang - Serang " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Surabaya") && stasiunAkhir.equals("Semarang")) {
                String jauhRute = "(350 km)";
                int hargaTiket = 35 * hargaFirst * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Surabaya - Semarang " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Surabaya") && stasiunAkhir.equals("Bandung")) {
                String jauhRute = "(700 km)";
                int hargaTiket = 70 * hargaFirst * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Surabaya - Bandung " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else if (stasiunAwal.equals("Yogyakarta") && stasiunAkhir.equals("Jakarta")) {
                String jauhRute = "(500 km)";
                int hargaTiket = 50 * hargaFirst * jumlahTiket;
                int kembalian = bayar-hargaTiket;

                if (hargaTiket<=bayar) {
                    NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                    String bayarString = titik.format(bayar);
                    String hargaString = titik.format(hargaTiket);
                    String kembalianString = titik.format(kembalian);

                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%37s\n", "Pemesanan Tiket Berhasil");
                    System.out.println("==================================================");
                    System.out.printf("%33s\n", "DETAIL PEMESANAN");
                    System.out.println("==================================================");

                    System.out.println("Nama\t\t\t\t\t: " + nama);
                    System.out.println("NIK\t\t\t\t\t\t: " + nik);
                    System.out.println("Alamat\t\t\t\t\t: " + alamat);
                    System.out.println("Nomor Telepon\t\t\t: " + notelp);
                    System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                    System.out.println("Rute\t\t\t\t\t: Yogyakarta - Jakarta " + jauhRute);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);

                    System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString, ",-");
                    System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran", bayarString, ",-");
                    System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian", kembalianString, ",-");
                    System.out.println("==================================================");
                }
                else {
                    System.out.print("\n\n==================================================");
                    System.out.printf("\n%30s\n", "Maaf, uang anda tidak mencukupi");
                    System.out.println("==================================================");
                }
            }
            else {
                System.out.print("\n\n==================================================\n");
                System.out.printf("%30s\n", "Maaf, rute tidak ditemukan");
                System.out.println("==================================================");
            }
        }
        else {
            System.out.print("\n\n==================================================");
            System.out.printf("%30s\n", "Maaf, tidak ada jenis tiket");
            System.out.println("==================================================");
        }
    }
}
