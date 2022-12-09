package LatihanUAP;

import java.util.Scanner;

public class NullCypher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int palingSedikit = 0;
        String masukan = input.nextLine().toUpperCase();
        String[] arr = masukan.split(" ");
        n = arr[0].length();
        int tmp = n;
        for (int i=1;i< arr.length;i++){
            n = arr[i].length();
            if (tmp>arr[i].length())
                tmp=arr[i].length();
        }
        palingSedikit=tmp;
        for (int j=0;j< arr.length;j++){
            System.out.print(arr[j].charAt(palingSedikit-1));
        }
    }
}
