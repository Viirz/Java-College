package nyoba;
import java.util.Scanner;

public class cobaSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.print("Masukkan input menu : ");
        int a = in.nextInt();

        if (a == 1) {
            System.out.println("Nasi Goreng");
        }
        else if (a == 2) {
            System.out.println("Nasi Kucing");
        }
            else {
            System.out.println("Tidak ada menu tsb");
        } */
        System.out.println("Daftar menu");
        System.out.println("1 : Nasi Goreng");
        System.out.println("2 : Nasi Kucing\n");

        System.out.print("Masukkan nomor menu : ");  int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Menu anda nasi goreng"); break;
            case 2:
                System.out.println("Menu anda nasi kucing"); break;
            default:
                System.out.println("Maaf tidak ada menu tersebut");

        }
      }
    }