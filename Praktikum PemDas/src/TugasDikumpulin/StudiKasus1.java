package TugasDikumpulin;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

        public class StudiKasus1 {
            public static void main(String[] args) throws Exception {
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
                System.out.print("Tanggal Keberangkatan\t: ");
                String tanggal = in.nextLine();
                System.out.print("Stasiun Asal\t\t\t: ");
                String stasiunAwal = in.nextLine();
                System.out.print("Stasiun Tujuan\t\t\t: ");
                String stasiunAkhir = in.nextLine();
                System.out.print("Jumlah Tiket\t\t\t: ");
                int tiket = in.nextInt();
                System.out.print("Nominal Pembayaran\t\t: ");
                int bayar = in.nextInt();
                System.out.println("==================================================");
                System.out.printf("%37s\n", "Pemesanan Tiket Berhasil");
                System.out.println("==================================================");
                System.out.printf("%33s\n", "DETAIL PEMESANAN");
                System.out.println("==================================================");

                int harga = tiket * 50000;
                int kembalian = bayar - harga;
                NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
                String bayarString = titik.format(bayar);
                String hargaString = titik.format(harga);
                String kembalianString = titik.format(kembalian);
                System.out.println("Nama\t\t\t\t\t: " + nama);
                System.out.println("NIK\t\t\t\t\t\t: " + nik);
                System.out.println("Alamat\t\t\t\t\t: " + alamat);
                System.out.println("Nomor Telepon\t\t\t: " + notelp);
                System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                System.out.println("Stasiun Asal\t\t\t: " + stasiunAwal);
                System.out.println("Stasiun Tujuan\t\t\t: " + stasiunAkhir);
                System.out.println("Jumlah Tiket\t\t\t: " + tiket);
                System.out.printf("\n%s\t\t\t\t: %s%s", "Total Harga", hargaString,
                        ",-");
                System.out.printf("\n%s\t\t: %s%s", "Nominal Pembayaran",
                        bayarString, ",-");
                System.out.printf("\n%s\t\t\t\t: %s%s \n", "Kembalian",
                        kembalianString, ",-");
                System.out.println("==================================================");
            }
        }