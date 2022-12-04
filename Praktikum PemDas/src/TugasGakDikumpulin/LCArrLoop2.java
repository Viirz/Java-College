package TugasGakDikumpulin;

import java.util.Arrays;
import java.util.Scanner;

public class LCArrLoop2 {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        int x = nt.nextInt();
        int[] arr = new int[x];
        int total = 0;
        int j = 2;
        int primabesar=0;

        for (int i=1;i<x;i++){
            arr[i] = nt.nextInt();
        }
        for (int i=0;i<arr[i];i++){
            if (arr[i]%j == 0){
                total += arr[i];
                if (primabesar<arr[i]){
                    primabesar = arr[i];
                }
            }
            ++j;
        }


        Arrays.sort(arr);
        int kali = total*primabesar;
        System.out.println(kali);
    }
}
