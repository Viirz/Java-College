package nyoba;

import java.util.Scanner;

public class MencobaArray {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = a[0]+a[2];
        a[4] = a[3]-a[1];
        for (int x = 0;x<a.length;x++){
            System.out.printf("data ke %d adalah %d\n", x, a[x]);
        }
        System.out.println("=============================================");
        int b[] = new int[] {1,2,3,5,7};
        for (int x = 0;x<b.length;x++){
            System.out.printf("data ke %d adalah %d\n", x, b[x]);
        }
        System.out.println("=============================================");
        int d[] = {30,20,15,63,24,56};
        int jumlah= 0;
        for (int x=0;x<d.length;x++){
            System.out.printf("data ke %d adalah %d\n", x, d[x]);
            jumlah += d[x];
            System.out.println(jumlah);
        }
        System.out.println("=============================================");
        int e[] = {1,3,5,7,9,10};
        for (int x=0;x<e.length;x++){
            System.out.print("Ini data ke " + (x+1) + " ");
            for (int y = 0; y < e[x]; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
