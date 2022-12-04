package TugasDikumpulin;

import java.util.Scanner;

public class MencobaMethod {
    public static int penjumlahan(int x, int y){
        return x+y;
    }
    public static int pembagian(int x, int y){
        return x/y;
    }
    public static int perkalian(int x, int y){
        return x*y;
    }
    public static int pengurangan(int x, int y){
        return x-y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x = ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y = ");
        int y = input.nextInt();

        System.out.println(penjumlahan(x,y));
        System.out.println(pengurangan(x,y));
        System.out.println(perkalian(x,y));
        System.out.println(pembagian(x,y));
    }
}
