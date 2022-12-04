package TugasGakDikumpulin;

import java.util.Scanner;

public class PraktekIFELSE {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka1 = nt.nextInt();

        if (angka1 >= 1) {
            if (angka1 % 2 == 0) {
                System.out.printf("Angka %d adalah bilang positif dan genap", angka1);
            }
            else {
                System.out.printf("Angka %d adalah bilangan positif dan ganjil", angka1);
            }
        }
        else if (angka1 < 0) {
            if (angka1 %2 == 0){
                System.out.printf("Angka %d adalah bilangan negatif dan genap", angka1);
            }
            else {
                System.out.printf("Angka %d adalah bilangan negatif dan ganjil", angka1);
            }
        }

    }
}
