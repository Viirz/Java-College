package BelajarJava29;

public class ForLoop {
    public static void main(String[] args) {

        //      for (inisialisasi; kondisi; stack nilai){
        //          aksi;
        //      }


        System.out.println("Ini adalah awal program");

        System.out.println("Loop pertama");
        for (int i = 0; i<=10;i++){
            System.out.println("For loop ke -  " + i);
        }

        System.out.println("Loop kedua");
        for (int i = 0; i<10;i++){
            System.out.println("For loop ke -  " + i);
        }

        System.out.println("Loop keempat");
        int i = 0;
        for (; i<=10;){
            System.out.println("For loop ke -  " + i);
            i++;
        }

        System.out.println("Ini adalah akhir program");
    }
}
