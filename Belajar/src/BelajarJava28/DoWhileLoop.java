package BelajarJava28;

public class DoWhileLoop {
    public static void main(String[] args) {

       /* do {

        } while (kondisi);
       */

        System.out.println("Ini adalah awal program");
        int a = 0;
        boolean kondisi = true;
        do {
            a++;
            System.out.println("do while ke - " + a);
            if (a>=10){
                kondisi = false;
            }
        } while (kondisi);
        System.out.println("Ini adalah akhir program");
    }
}
