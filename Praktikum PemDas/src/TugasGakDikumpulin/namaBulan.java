package TugasGakDikumpulin;

import java.util.Scanner;

public class namaBulan {
    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);
        String bulan = nc.nextLine();

        switch (bulan) {
            case "januari","maret","mei", "juli", "agustus", "oktober", "desember" -> System.out.print("31");
            case "februari" -> System.out.print("28");
            case "april", "juni", "september", "november" -> System.out.print("30");
        }

    }
}
