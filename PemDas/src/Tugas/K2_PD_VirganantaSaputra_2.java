package Tugas;

import java.util.Arrays;
import java.util.Scanner;

public class K2_PD_VirganantaSaputra_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data[][] = new int[100][100];
        int countN=0; int countM=0;
        System.out.println("Masukkan matriks (n x m)");
        for (int i=0;i<3;i++){
            for (int j =0;j<3;j++){
                countM = 0;
                data [i][j] = input.nextInt();
                countM++;
            }
            countN++;
        }
        sortRows(data);
        System.out.println("Matriks terurut: ");
        for (int j=0;j<3;j++){
            for (int k=0;k<3;k++){
                System.out.print(data[j][k]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] sortRows(int[][] m){
        int sum = 0;
        int palingkecil = 0;
        for (int i=0;i<3;i++){
            sum += m[0][i];
            palingkecil = sum;
        }
        for (int j=0;j<3;j++){
            for (int k=0;k<3;k++){
                sum += m[j][k];
            }
            if (sum==0)
                continue;
            if (palingkecil>sum){
                palingkecil=sum;
                for (int l=0;l<3;l++){
                    int tmp = m[j][l];
                    m[j][l] = m[j-1][l];
                    m[j-1][l] = tmp;
                }
            }
            sum =0;
        }
    return m;
    }
}
