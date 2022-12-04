package BelajarJava10;

public class OperatorAritmatika {
    public static void main(String[] args) {

        //Operasi Aritmatika

        int variabel1 = 8;
        int variabel2 = 3;
        int hasil;

        //1. Penjumlahan

        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);
        System.out.println("Hasil penjumlahan = " + hasil);

        //2. Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n" , variabel1, variabel2, hasil);
        System.out.printf("%s = %d \n", "Hasil pengurangan",hasil);

        //3. Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n" , variabel1, variabel2, hasil);
        System.out.printf("%s = %d \n", "Hasil perkalian",hasil);

        //4. Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n" , variabel1, variabel2, hasil);
        System.out.printf("%s = %d \n", "Hasil pembagian",hasil);

        //5. Modulus(sisa pembagian)
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n" , variabel1, variabel2, hasil);
        System.out.printf("%s = %d \n", "Sisa pembagian (Modulus)",hasil);

    }
}
