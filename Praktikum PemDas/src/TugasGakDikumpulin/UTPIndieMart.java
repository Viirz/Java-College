package TugasGakDikumpulin;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class UTPIndieMart {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        int harga = nc.nextInt(); int bayar = nc.nextInt();
        int kembalian = bayar-harga;
        final int pecahan1 = 50000, pecahan2 = 20000, pecahan3 = 10000, pecahan4 = 5000, pecahan5 = 2000, pecahan6 = 1000, pecahan7 = 500;
        int sisa;
        int bagipecahan1 = kembalian/pecahan1,
                bagipecahan2 = (kembalian-pecahan1*bagipecahan1)/pecahan2,
                bagipecahan3 = (kembalian-(pecahan1*bagipecahan1)-(pecahan2*bagipecahan2))/pecahan3,
                bagipecahan4 = (kembalian-(pecahan1*bagipecahan1)-(pecahan2*bagipecahan2)-(pecahan3*bagipecahan3))/pecahan4,
                bagipecahan5 = (kembalian-(pecahan1*bagipecahan1)-(pecahan2*bagipecahan2)-(pecahan3*bagipecahan3)-(pecahan4*bagipecahan4))/pecahan5,
                bagipecahan6 = (kembalian-(pecahan1*bagipecahan1)-(pecahan2*bagipecahan2)-(pecahan3*bagipecahan3)-(pecahan4*bagipecahan4)-(pecahan5*bagipecahan5))/pecahan6,
                bagipecahan7 = (kembalian-(pecahan1*bagipecahan1)-(pecahan2*bagipecahan2)-(pecahan3*bagipecahan3)-(pecahan4*bagipecahan4)-(pecahan5*bagipecahan5)-(pecahan6*bagipecahan6))/pecahan7;

        System.out.printf("Kembalian : Rp %d\n", kembalian);
        NumberFormat titik = NumberFormat.getNumberInstance(Locale.GERMAN);
        String pecahan1String = titik.format(pecahan1);
        String pecahan2String = titik.format(pecahan2);
        String pecahan3String = titik.format(pecahan3);
        String pecahan4String = titik.format(pecahan4);
        String pecahan5String = titik.format(pecahan5);
        String pecahan6String = titik.format(pecahan6);
        String pecahan7String = titik.format(pecahan7);

        if (bagipecahan1 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan1, pecahan1String);
        }
        if (bagipecahan2 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan2, pecahan2String);
        }
        if (bagipecahan3 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan3, pecahan3String);
        }
        if (bagipecahan4 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan4, pecahan4String);
        }
        if (bagipecahan5 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan5, pecahan5String);
        }
        if (bagipecahan6 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan6, pecahan6String);
        }
        if (bagipecahan7 >= 1){
            System.out.printf("%d x Rp %s\n",bagipecahan7, pecahan7String);
        }

        sisa = (kembalian%500);
        if (sisa>=1) {
            System.out.printf("Sisa : Rp %d",sisa);
        }

    }
}
