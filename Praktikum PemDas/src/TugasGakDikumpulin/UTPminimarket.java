package TugasGakDikumpulin;
import java.util.Scanner;

public class UTPminimarket {
    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        int harga = nc.nextInt();
        nc.nextLine();
        String opsi = nc.nextLine();
        int hargakirim = harga + (harga/10);

        System.out.println(harga);
        if (opsi.equals("Kirim")){
            System.out.println("Status delivery : Diantarkan");
            System.out.println("Total harga yang perlu dibayar : Rp " + hargakirim);
        }
        else if (opsi.equals("Ambil")) {
            System.out.println("Status delivery : Diambil");
        }
    }
}
