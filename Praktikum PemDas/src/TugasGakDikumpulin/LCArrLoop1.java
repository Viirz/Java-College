package TugasGakDikumpulin;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LCArrLoop1 {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        int kondisi = 0;

        String[] nama = nt.nextLine().split(", ");
        String cari = nt.nextLine();



        for (int i=0;i<nama.length;i++){
            String b = nama[i].toLowerCase();
            String a = cari.toLowerCase();
            if (a.equals(b)) {
                kondisi = 1;
                break;

            }
        }
        if (kondisi==1){
            System.out.println(cari + " ditemukan");
        } else
            System.out.println(cari + " tidak ditemukan");


    }
}
