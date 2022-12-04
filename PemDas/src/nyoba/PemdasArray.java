package nyoba;

import java.util.Arrays;
import java.util.Scanner;

public class PemdasArray {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        double[][] a = new double[3][4];
        System.out.print("Enter 3 rows and 4 columns: ");
        for (int i=0 ; i<a.length ; i++){
            for (int j=0 ; j<a[i].length ; j++){
                a[i][j] = nt.nextDouble();
            }
        }

    }
}
