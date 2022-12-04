package Tugas;

import java.util.Arrays;
import java.util.Scanner;

public class TugasArray7_3 {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        int[] a = new int[100];
        int bilangan, n=0,m=0;
        String jumlah = "time";

        System.out.print("Enter the integers between 1 and 100 : ");

        for (int i=0 ; i<a.length ; i++){
            bilangan = nt.nextInt();
            if (bilangan==0){
                break;
            }
            a[i] = bilangan;
            n++;
        }

        int[] b = new int[n];
        for (int i=0 ; i<n ; i++){
            b[i] = a[i];
        }

        Arrays.sort(b);
        int l=0;
        for (int i=0; i<b.length;i++) {
            m=0;
            if (l>=b[i]) {
                continue;
            }
            else {
                l = b[i];
                for (int j = 0; j < b.length; j++)
                    if (l == b[j]){
                        m++;
                    }
                System.out.printf("%d occurs %d ", l, m);
                if (m==1){
                    System.out.println("time.");
                } else {
                    System.out.println("times.");
                }

            }
        }
    }
}
