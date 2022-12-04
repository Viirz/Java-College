package BelajarJava19;
import java.util.*;

public class LatihanOperatorLogika {
    public static void main(String[] args) {

        // Membuat objek untuk menangkap imput dari user
        Scanner nc = new Scanner(System.in);

        // Sebuah pogram sederhana untuk menebak sebuah angka
        int nilaibenar = 6;
        int nilatebakan;

        System.out.print("Masukkan nilai : ");
        nilatebakan = nc.nextInt();
        System.out.println("Nilai tebakan anda adalah " + nilatebakan);

        // Operasi logika
        boolean status = (nilaibenar==nilatebakan);
        System.out.println("Tebakan anda adalah " + status);

        // Operasi aljabar boolean (AND / OR)
        System.out.print("\nMasukkan nilai diantara 2 dan 9 : ");
        nilatebakan = nc.nextInt();
        System.out.println("Nilai tebakan anda adalah " + nilatebakan);

        status = (nilatebakan>2) && (nilatebakan<9);
        System.out.println("Tebakan anda adalah " + status);

    }
}
