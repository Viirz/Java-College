package BelajarJava14;

public class OperatorKomparasi {
    public static void main(String[] args) {

        // Operator komparasi ini akan menghasilkan nilai dalam bentuk boolean

        int a, b;
        boolean hasilkomparasi;

        // Operator equal atau persamaan
        System.out.println("----- PERSAMAAN");
        a = 10; b=10;
        hasilkomparasi = (a==b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilkomparasi);

        a = 12; b=10;
        hasilkomparasi = (a==b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilkomparasi);

        // Operator not equal atau tidakpersamaan
        System.out.println("----- PERTIDAKSAMAAN");
        a = 10; b=10;
        hasilkomparasi = (a!=b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilkomparasi);

        a = 12; b=10;
        hasilkomparasi = (a!=b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilkomparasi);

        // Operator less than atau kurang dari
        System.out.println("----- KURANG DARI");
        a = 10; b=10;
        hasilkomparasi = (a<b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilkomparasi);

        a = 12; b=10;
        hasilkomparasi = (a<b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilkomparasi);

        // Operator greater than atau lebih dari
        System.out.println("----- LEBIH DARI");
        a = 10; b=10;
        hasilkomparasi = (a>b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilkomparasi);

        a = 12; b=10;
        hasilkomparasi = (a>b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilkomparasi);

        // Operator less than equal atau kurang dari
        System.out.println("----- KURANG DARI SAMADENGAN");
        a = 10; b=10;
        hasilkomparasi = (a<=b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilkomparasi);

        a = 12; b=10;
        hasilkomparasi = (a<=b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilkomparasi);

        // Operator greater equal than atau lebih dari
        System.out.println("----- LEBIH DARI SAMADENGAN");
        a = 10; b=10;
        hasilkomparasi = (a>=b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilkomparasi);

        a = 12; b=10;
        hasilkomparasi = (a>=b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilkomparasi);
    }
}
