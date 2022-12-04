package BelajarJava18;

import java.util.Scanner;

public class PengelompokanOperasiAritmatika {
    public static void main(String[] args) {

        // Perkalian/pembagian dilakukan dahulu
        // Kecuali ada didalam kurung
        int hasil = (10 + 2) * 5;
        System.out.println(hasil);
        int hasil2 = (5+2-10);
        System.out.println(hasil2);

        //Operasi agak rumit (perhitungan persamaan kuadrat)
        Scanner in = new Scanner(System.in);

        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;
        System.out.print("Nilai x = ");
        x = in.nextInt();
        System.out.print("Nilai m = ");
        m = in.nextInt();
        System.out.print("Nilai c = " );
        c = in.nextInt();
        int y = (m*x*x) + c;
        System.out.println("Nilai y = " + y );





    }
}
