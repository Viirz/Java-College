package TugasDikumpulin;
import java.util.Scanner;

public class Praktikum07Okt{
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        System.out.print("Berat badan (kg) : ");
        float b = nt.nextFloat();
        System.out.print("Tinggi badan (m) : ");
        float t = nt.nextFloat();

        float imt = b/(t*t);
        System.out.printf("IMF = %.2f\t\t\t\t", imt);

        if (imt <= 18.5){
            System.out.println("Termasuk Kurus");
        }
        else if (imt>18.5 && imt <=25) {
            System.out.println("Termasuk Normal");
        }
        else if (imt>25 && imt <=30) {
            System.out.println("Termasuk Gemuk");
        }
        else if (imt > 30){
            System.out.println("Termasuk Kegemukan");
        }
    }
}

