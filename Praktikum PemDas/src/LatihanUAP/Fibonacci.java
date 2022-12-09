package LatihanUAP;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int many = input.nextInt();
        int[] arr = new int[many+1];

        arr[0] = 0;
        if (many>0)
        arr[1] = 1;
        for (int a=0;a<=many;a++){
            if (a<2)
            System.out.println(arr[a]);
        }
        for (int i=2;i<=many;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
    }
}
