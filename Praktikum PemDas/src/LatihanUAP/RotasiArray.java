package LatihanUAP;

import java.util.Arrays;
import java.util.Scanner;

public class RotasiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = new String[1];
        int q = 0;

        arr[0] = input.nextLine();

        String[] dataArray = arr[0].split(",");
        int[] data = new int[dataArray.length];
        for (int a=0;a<data.length;a++){
            data[a] = Integer.parseInt(dataArray[a]);
        }

        String rotasi = input.nextLine();
        int nRotasi = input.nextInt();

        if (rotasi.equals("kiri")){
            for (int i=0;i<nRotasi;i++){
                int tmp = data[0];
                for (int j=1;j<data.length;j++){
                    data[j-1] = data[j];
                }
                data[data.length-1] = tmp;
            }
        } else if (rotasi.equals("kanan")) {
            for (int i = 0; i < nRotasi; i++) {
                int tmp = data[data.length - 1];
                for (int j = data.length-1;j>0; j--) {
                    data[j] = data[j-1];
                }
                data[0] = tmp;
            }
        }
        for (int a=0;a<data.length;a++)
        System.out.print(data[a] + " ");
    }
}
