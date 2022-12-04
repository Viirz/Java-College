package nyoba;
import java.util.Scanner;

public class mencobapercabangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai x : "); int x = in.nextInt();

            if (x % 2 == 0) {
                System.out.println("Nilai x adalah bilangan genap");
            }
            else {
                System.out.println("Nilai x adalah bilangan ganjil");
            }
    }

}
