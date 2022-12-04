package TugasGakDikumpulin;
 import java.util.Scanner;

public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print ("Masukkan operator pertama : ");
        int int1 = in.nextInt();
        System.out.print ("Masukkan operator kedua : ");
        int int2 = in.nextInt();

        System.out.print ("Hasil Tambah \t : ");
        System.out.println (int1 + int2);

        System.out.print ("Hasil Kurang \t : ");
        System.out.println (int1 - int2);

        System.out.print ("Hasil Kali \t\t : ");
        System.out.println (int1 * int2);

        System.out.print ("Hasil Bagi \t\t : ");
        System.out.println ((float)int1/int2);
    }

}
