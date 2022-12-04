package TugasGakDikumpulin;

import java.util.Arrays;
import java.util.Scanner;

public class MencobaArray2 {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        // Membagi kalimat per kata lalu masuk array
        System.out.println("Masukkan kalimat yang akan di pecah : ");
        String[] nama = nt.nextLine().split(" ");
        System.out.println(Arrays.toString(nama) + "\n" );
        System.out.println("=========================================");

        // Membagi String menjadi char lalu masuk ke array
        System.out.println("Masukkan kata yang akan di pecah : ");
        String a = nt.nextLine();
        char[] pecah = a.toCharArray();
        System.out.println(Arrays.toString(pecah));
        System.out.println("=========================================");

        // Memasukkan nilai int ke array
        int[] angka = new int[10];
        for (int i=0;i<angka.length;i++){
            System.out.print("Masukkan nilai yang ingin anda input ke array : ");
            angka[i] = nt.nextInt();
        }
        System.out.println(Arrays.toString(angka));

    }
}
