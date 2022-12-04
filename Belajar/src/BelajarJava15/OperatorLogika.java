package BelajarJava15;

public class OperatorLogika {
    public static void main(String[] args) {

        // Operator logika = operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean a,b,c;

        // OR / Atau (||)
        System.out.println("===== OR (||) =====");
        a = true;
        b = true;
        c = (a||b);
        System.out.printf("%b || %b = %b\n", a, b, c);
        a = true;
        b = false;
        c = (a||b);
        System.out.printf("%b || %b = %b\n", a, b, c);
        a = false;
        b = true;
        c = (a||b);
        System.out.printf("%b || %b = %b\n", a, b, c);
        a = false;
        b = false;
        c = (a||b);
        System.out.printf("%b || %b = %b\n", a, b, c);

        // AND / Dan (&&)
        System.out.println("===== AND (&&) =====");
        a = true;
        b = true;
        c = (a&&b);
        System.out.printf("%b && %b = %b\n", a, b, c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.printf("%b && %b = %b\n", a, b, c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.printf("%b && %b = %b\n", a, b, c);
        a = false;
        b = false;
        c = (a&&b);
        System.out.printf("%b && %b = %b\n", a, b, c);

        // XOR / Exclusive Or (^)
        System.out.println("===== XOR (^) =====");
        a = true;
        b = true;
        c = (a^b);
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        a = true;
        b = false;
        c = (a^b);
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        a = false;
        b = true;
        c = (a^b);
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        a = false;
        b = false;
        c = (a^b);
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        // NOT / Negasi  (!)
        System.out.println("====== Negasi (!) ======");
        a = false;
        c = !a;
        System.out.printf("%b --> (!) = %b\n", a, c);
        a = true;
        c = !a;
        System.out.printf("%b --> (!) = %b\n", a, c);
    }
}
