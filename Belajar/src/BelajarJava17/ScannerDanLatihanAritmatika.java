package BelajarJava17;

import java.util.Scanner;

public class ScannerDanLatihanAritmatika {
    public static void main(String[] args) {

        //Menghitung luas
        //luas = panjang x lebar
        Scanner in = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        String nama, namaku;

        System.out.print("Masukkan nama mu = ");
        nama = in.nextLine();
        System.out.print("Masukkan panjang(m) = ");
        panjang = in.nextInt();
        System.out.print("Masukkan lebar(m) = ");
        lebar = in.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas rumah = " + luas + " m2");

        //Menghitung volume
        //luas = panjang x lebar x tinggi
        System.out.print("Masukkan nama mu = ");
        namaku = in.nextLine();
        System.out.print("Masukkan panjang(m) = ");
        panjang = in.nextInt();
        System.out.print("Masukkan lebar(m) = ");
        lebar = in.nextInt();
        System.out.print("Masukkan tinggi(m) = ");
        tinggi = in.nextInt();
        volume = panjang * lebar * tinggi;
        System.out.println("Volume rumah = " + volume + " m2");

    }
}
