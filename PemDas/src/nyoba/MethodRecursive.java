package nyoba;

import java.util.Scanner;

public class MethodRecursive {
    static int faktorial(int x){
        if (x>0){
            return x*faktorial(x-1);
        } else
            return 1;
    }
    static long menghitungfibonacci(int n){
        if (n==0 || n==1){
            return n;
        } else
            return menghitungfibonacci(n-2) + menghitungfibonacci(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan faktorial = ");
        int x = input.nextInt();
        int hasilfaktorial = faktorial(x);
        System.out.printf("Hasil dari %d! faktorial adalah %d",x,hasilfaktorial);
    }
    static void hitungfibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Menghitung Suku Fibonacci=====");
        System.out.print("Mengitung fibonacci suku ke : ");
        int dicari = input.nextInt();
        System.out.printf("Hasil dari fibonacci suku ke %d adalah %d",dicari,menghitungfibonacci(dicari));
    }
}
