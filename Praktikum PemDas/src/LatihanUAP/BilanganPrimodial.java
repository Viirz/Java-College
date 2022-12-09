package LatihanUAP;

import java.util.Scanner;

public class BilanganPrimodial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] arr = new int[number];
        int counter = 0; int count=0;
        long sum=0;
        while (counter<number){
            for (int i=0;i<100;i++){
                if (i>1) {
                    for (int j = 0; j <= i; j++) {
                        if (j>1) {
                            if (i % j == 0)
                                count++;
                        }
                    }
                    if (count==1) {
                        if (counter<number) {
                            arr[counter] = i;
                            counter++;
                        }
                }
                    count=0;
                }
            }
        }
        if (counter>0) {
            sum = 1;
            for (int s : arr) {
                sum *= s;
            }
        }
        System.out.println(sum);
    }
}
