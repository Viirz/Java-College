package TugasGakDikumpulin;

import java.util.Scanner;

public class UTPBankJago {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        int saldo = 50000, uang;
        String nama, tariktambah;
        char kondisi;

        nama = nt.nextLine();
        tariktambah = nt.next();
        uang = nt.nextInt();
        kondisi = tariktambah.charAt(2);
        if (nama == ""){
            nama = ("-");
        }
        if (tariktambah.charAt(2)=='r' || tariktambah.charAt(2)=='R') {
            if (saldo >= uang) {
                System.out.println("Penarikan berhasil!");
                System.out.println("Nama : " + nama);
                System.out.printf("Saldo : %d", (saldo -= uang));
            } else {
                System.out.println("Maaf, saldo tidak cukup");
                System.out.printf("Nama : %s\n", nama);
                System.out.printf("Saldo : %d", saldo);
            }
        }
        else if (tariktambah.charAt(2)=='m'||tariktambah.charAt(2)=='M') {
            System.out.println("Pengisian saldo berhasil!");
            System.out.printf("Nama : %s\n", nama);
            System.out.printf("Saldo : %d", (saldo += uang));
        }
    }
}
