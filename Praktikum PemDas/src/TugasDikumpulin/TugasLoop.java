package TugasDikumpulin;

import java.util.Scanner;

public class TugasLoop {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        int a,i,j;
        a = nt.nextInt();

        for (i=1;i<=a;i++){
            for (j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
