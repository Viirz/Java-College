package nyoba;

import java.util.Scanner;

public class matkom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Menghitung Suku Fibonacci=====");
        System.out.print("Mengitung fibonacci f ke : ");
        int dicari = input.nextInt();

        int sukuke0 = 0;
        int sukuke1 = 1;
        long[] sukuke = new long[(dicari+1)];
        sukuke[0] = sukuke0;
        sukuke[1] = sukuke1;

        for (int i=2;i<sukuke.length;i++){
            sukuke[i]=(sukuke[(i-2)]+sukuke[(i-1)]);
            if (i==(dicari)){
                System.out.println(sukuke[i]);
            }
        }
    }
}
