package TugasGakDikumpulin;

import java.util.Scanner;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class UTPGerbangTol {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        String plat = nc.nextLine();
        String hari = nc.nextLine();
        int gerbang1 = nc.nextInt(); int gerbang2 = nc.nextInt(); int gerbang3 = nc.nextInt();
        int kecepatan1 = nc.nextInt(), kecepatan2 = nc.nextInt(), kondisi =0;
        int a = min(min(gerbang1, gerbang2),gerbang3);
        int b = max(max(gerbang1, gerbang2),gerbang3);
        System.out.print(plat);

        if (kecepatan1>kecepatan2){
        switch (hari){
            case "pagi" :
                kondisi = 1; break;
            case "siang" :
                kondisi = 2; break;
            case "sore" :
                kondisi = 3; break;
            case "malam" :
                kondisi = 2; break;
        }
        }
        else if (kecepatan1<kecepatan2){
            kondisi = 4;
        }
        else if (kecepatan1 == kecepatan2) {
            kondisi = 5;
        }

        if (kondisi == 1) {
            if (a == gerbang1) {
                System.out.println(" lewat gerbang kiri");
            }
            else if (a == gerbang2) {
                System.out.println(" lewat gerbang tengah");
            }
            else if (a == gerbang3) {
                System.out.println(" lewat gerbang kanan");
            }
        }
        if (kondisi == 2) {
            if (b == gerbang1) {
                System.out.println(" lewat gerbang kiri");
            }
            else if (b == gerbang2) {
                System.out.println(" lewat gerbang tengah");
            }
            else if (b == gerbang3) {
                System.out.println(" lewat gerbang kanan");
            }
        }
        if (kondisi == 3) {
            if (a != gerbang1 && b != gerbang1) {
                System.out.println(" lewat gerbang kiri");
            }
            else if (a != gerbang2 && b != gerbang2) {
                System.out.println(" lewat gerbang tengah");
            }
            else if (a != gerbang3 && b != gerbang3) {
                System.out.println(" lewat gerbang kanan");
            }
        }
        else if (kondisi==4){
            if (a == gerbang1) {
                System.out.println(" lewat gerbang kiri");
            }
            else if (a == gerbang2) {
                System.out.println(" lewat gerbang tengah");
            }
            else if (a == gerbang3) {
                System.out.println(" lewat gerbang kanan");
            }
        }
        else if (kondisi==5){
            if (a == gerbang1) {
                System.out.println(" lewat gerbang kiri");
            }
            else if (a == gerbang2) {
                System.out.println(" lewat gerbang tengah");
            }
            else if (a == gerbang3) {
                System.out.println(" lewat gerbang kanan");
            }
        }
    }
}
