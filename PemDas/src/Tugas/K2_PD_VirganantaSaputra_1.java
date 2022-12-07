package Tugas;

import java.util.Scanner;

public class K2_PD_VirganantaSaputra_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[100];
        int nilaiGenap = 0; int sum = 0;
        for (int a=0;a<data.length;a++) {
            System.out.print("Masukkan data (0 untuk berhenti) = ");
            for (int i = 0; i < data.length; i++) {
                data[i] = input.nextInt();
                if (data[i] == 0)
                    break;
            }

            for (int j = 0; j < data.length; j++) {
                if (data[j] == 0)
                    continue;
                if (data[j] % 2 == 0) {
                    sum += data[j];
                    nilaiGenap++;
                }
            }
            double rerata = computeArray(data);
            System.out.println("Banyak nilai genap = " + nilaiGenap);
            System.out.println("Jumlah nilai genap = " + sum);
            System.out.printf("Rata rata          = %.1f\n", rerata);
            System.out.print("Apakah anda ingin mengulang(Y/T)? ");
            String yesorno = input.next();
            if (yesorno.equals("T")){
                break;
            } else if (yesorno.equals("Y")) {
                sum = 0;nilaiGenap=0;rerata=0;
            }
        }
    }
    static float computeArray(int[] x){
        float nilaiGenap = 0; int sum = 0;
        for (int j=0;j<x.length;j++){
            if (x[j]==0)
                continue;
            if (x[j]%2==0){
                sum += x[j];
                nilaiGenap++;
            }
        }
        return sum/nilaiGenap;
    }
}
