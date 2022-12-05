package LiangBook;

import java.util.Scanner;

public class Exercise8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input many employes: ");
        int employes = input.nextInt();
        int [][] data = new int[employes][7];
        for(int i=0;i<employes;i++){
            for(int j=0;j<7;j++){
                data[i][j] = input.nextInt();
            }
        }
        printdata(data,employes);
        for (int k=0;k<employes;k++){
            int weeklyhours = 0;
            for (int l=0;l<7;l++) {
                weeklyhours += data[k][l];
            }
            System.out.printf("Weekly hours for employee%d is %d\n", k, weeklyhours);
        }

    }
    static void printdata(int[][] data,int employes){
        System.out.printf("%s\t\t\t\t Su\tM\tT\tW\tTh\tF\tSa\n", "");
        for (int i=0;i<employes;i++){
            System.out.printf("%s%d\t\t ","Employee",i);
            for (int j=0;j<7;j++){
                System.out.printf("%d\t", data[i][j]);
            }
            System.out.println("");
        }
    }
}
