package LiangBook;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] number = new double[4][4];
        double[] number1 = new double[4];
        System.out.println("Enter a 4-by-4 row by row");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                number[i][j] = input.nextDouble();
                number1[j] = number[i][j];
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                number1[j] = number[i][j];
            }
            Arrays.sort(number1);
            System.out.print("\n"+Arrays.toString(number1));
        }

    }

}
