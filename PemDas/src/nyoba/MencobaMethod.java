package nyoba;

import java.util.Scanner;

public class MencobaMethod {
    public static int menghitungjumlah (int x,int y) {
        return x+y;
    }
    public static int inputpenjumlahan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai x = ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai y = ");
        int b = input.nextInt();

        return menghitungjumlah(a,b);
    }
    public static void main(String[] args) {
        System.out.println(inputpenjumlahan());
    }
}
