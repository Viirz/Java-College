package TugasGakDikumpulin;

import java.util.Arrays;
import java.util.Scanner;

public class MencobaArrayBasic {
    public static void main(String[] args) {
        int[] a = {1,4,5,0,9};
        int[][] b = {{1,2,3},{3,4,1,7},{5,6},{5,1,6},{8,4,2,3,1}};
        int[][][] c = new int[3][4][5];


        // Cara 1 print array 1 dimensi
        System.out.println("Ini array a cara 1 :");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        } System.out.println("");

        // Cara 2 print array 1 dimeni
        System.out.println("Ini array a cara 2 :");
        for (int j : a){
            System.out.print(j);
        } System.out.println("");

        // Cara 3 print array 1 dimensi
        System.out.println("Ini array a cara 3 : ");
        System.out.print(Arrays.toString(a));
        System.out.println("");

        // Cara 1 print array 2 dimensi
        System.out.println("Ini array b cara 1 : ");
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j] + "\t");
            } System.out.println("");
        }
        // Cara 1 print array 3 dimensi
        System.out.println("Ini aray c cara 1 : ");
        for (int i=0 ; i<c.length ; i++){
            for (int j=0 ; j<c[i].length ; j++){
                for (int k=0 ; k<c[j].length ; k++){
                    System.out.println(c[i][j][k] + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
