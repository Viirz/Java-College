package BelajarJava27;

public class WhileLoop {
    public static void main(String[] args) {

        /*
        while (kondisi){
            aksi
        }
        */
        System.out.println("Ini adalah awal program");
        int a =0;
        boolean kondisi = true;
        while (kondisi){
            System.out.println("while loop ke - " + a);
            a++;
            if (a==10){
                kondisi = false;
            }
        }
        System.out.println("Ini adalah akhir program");


    }
}
