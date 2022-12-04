package BelajarJava11;

public class KonversiTipeDataNumeric {
    public static void main(String[] args) {

        //Program untuk konversi data

        int nilaiInt = 250; //32bit
        System.out.println("Nilai int = " + nilaiInt);

        //Memperluas rentang ke tipe data lebih besar
        long nilaiLong = nilaiInt; //64bit
        System.out.println("Nilai long = " + nilaiLong);

        //Memperkecil rentang ke tipe data lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);

        //Casting pembagian
        float a = 10;
        int b = 4;
        float c = a/b;
        System.out.printf("%f / %d = %f \n",a, b, c);

        int x = 10;
        int y = 4;
        float z = (float)x/y;
        System.out.printf("%d / %d = %f \n",x, y, z);

    }
}
