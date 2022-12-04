package TugasDikumpulin;

import java.util.Arrays;
import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        int[] a = new int[10];
        int total = 0;
        int ratarata = 0;

        for (int i=0;i<a.length;i++){
            a[i] = nt.nextInt();
        }

        int nilaimin = a[0];
        int nilaimax = a[0];

        for (int i = 0; i<a.length;i++){
            total += a[i];
            ratarata = total/a.length;
            if (a[i] > nilaimax) {
                nilaimax = a[i];
            }
            if (a[i] < nilaimin) {
                nilaimin = a[i];
            }
        }
        System.out.println("Nilai anda adalah : " + Arrays.toString(a));
        System.out.println("Nilai maximum adalah : " + nilaimax);
        System.out.println("Nilai minimum adalah : " + nilaimin);
        System.out.println("Nilai rata rata adalah : " + ratarata);





    }
}
