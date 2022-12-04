package Tugas;

import java.util.Scanner;

public class TugasArray7_4 {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        int[] a = new int[100];
        int ratarata; int n=0; int jumlah=0; int total=0;

        System.out.println("Masukkan nilai : ");
        for (int i=0;i<a.length;i++){
            int bilangan = nt.nextInt();
            if (bilangan<0) break;
            a[i] = bilangan;
            n++;
            total += bilangan;
        }
        ratarata = total/n;
        int diatassama = 0;
        int dibawah = 0;
        for (int i=0 ; i<n ; i++){
            if (a[i] >= ratarata){
                diatassama++;
            }
            else {
                dibawah++;
            }
        }

        System.out.println("Rata Rata : " + ratarata);
        System.out.println("Nilai diatas rata rata : " + diatassama);
        System.out.println("Nilai dibawah rata rata : " + dibawah);
    }
}
