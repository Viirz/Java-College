package TugasGakDikumpulin;

import java.util.Scanner;

public class nyobaloop {
    public static void main(String[] args) {

        Scanner nt = new Scanner(System.in);
        int i;
        for (i=0;i<100;i++){
            System.out.print("Masukkan nilai 1 : ");
            int a = nt.nextInt();
            System.out.print("Masukkan nilai 2 : ");
            int b = nt.nextInt();

            System.out.println("Hasil perkalian adalah : " + (a*b));
            nt.nextLine();
            System.out.print("Apakah anda ingin lanjut(Ya/Tidak)? ");
            String yesno = nt.nextLine();

            if (yesno.equals("Tidak")){
                break;
            }
        }

    }
}
