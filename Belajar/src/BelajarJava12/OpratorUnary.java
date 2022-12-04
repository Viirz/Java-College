package BelajarJava12;

public class OpratorUnary {
    public static void main(String[] args) {

        // Unary = operasi yang dilakukan pada satu variabel

        // Unary + dan -
        int angka = 1;
        System.out.printf("Unary '-', %d menjadi %d\n", angka, -angka);
        System.out.printf("Unary '+', %d menjadi %d\n", angka, +angka);

        // Unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.printf("Nilai dengan '++' menjadi = %d\n", angka2);

        int angka3 = 10;
        angka3--;
        System.out.printf("Nilai dengan '++' menjadi = %d\n", angka3);

        int a = 5;
        System.out.printf("Nilai dengan '++' prefix menjadi = %d\n", ++a);
        int b = 5;
        System.out.printf("Nilai dengan '++' postfix menjadi = %d\n", b++);
        System.out.printf("Nilai hasil dari postfix menjadi = %d\n", b);

        // Unary boolean dengan tanda ! untuk negasi
        boolean n = true;
        System.out.println("Nilai boolean = " + n);
        System.out.println("Nilai boolean = " + !n);
    }
}
