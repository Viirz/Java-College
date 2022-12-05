package LiangBook;

import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] number = new double[4][4];
        double sum = 0;
        System.out.println("Enter a 4-by-4 row by row");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                number[i][j] = input.nextDouble();
            }
        }
        sum = sumMajorDiagonal(number);
        System.out.println("Sum of the element in the major diagonal is " + sum);
    }

    static double sumMajorDiagonal(double[][] m) {
    double sum = 0;
    for (int i=0;i<4;i++){
        sum +=  m[i][i];
    }
    return sum;
    }
}
