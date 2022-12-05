package LiangBook;

import java.util.Scanner;

public class Exercise8_1 {
    public static void main(String[] args) {
        double[][] number = new double[3][4];
        int columnIndex = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 row by row");
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                number[i][j] = input.nextDouble();
            }
        }
        for (int i=0;i<4;i++){
            sum = sumColumn(number,columnIndex);
            System.out.printf("Sum of the elements at column %d is %.1f\n", columnIndex,sum);
            columnIndex++;
        }
    }

    static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i=0;i<3;i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
