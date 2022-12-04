package Tugas;

import java.util.Arrays;
import java.util.Scanner;

public class TugasAkhir {
    final static int MAX_SISWA = 10;
    final static int MAX_MATPEL = 10;
    final static int MAX_SEMESTER = 2;
    // menyimpan nama siswa
    static String[] siswa = new String[MAX_SISWA];
    // menyimpan nama matpel per siswa tiap semester, semester ganjil=0, genap=1
    static String[][][] siswaMatpel = new String[MAX_SISWA][MAX_SEMESTER][MAX_MATPEL];
    // menyimpan nilai matpel per siswa tiap semester, semester ganjil=0, genap=1
    static double[][][] siswaMatpelNilai = new double[MAX_SISWA][MAX_SEMESTER][MAX_MATPEL];
    // menyimpan banyak siswa
    static int banyakSiswa = 0;
    // menyimpan banyak matpel
    static int banyakSiswaMatpel = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] perintah = new String[500];
//            nextLine().split(" ");
        for (int i = 0; i < perintah.length; i++) {
            String masukan = input.nextLine();
            if (masukan.equals("")) {
                break;
            }
            perintah[i] = masukan;
        }
        for (int i = 0; i < perintah.length; i++) {
            String[] jenisPerintah = perintah[i].split(" ");
            if (jenisPerintah[i].equals("null")) {
                continue;
            } else if (jenisPerintah[i].equals("SISWA")) {
                String nama = jenisPerintah[i + 1];
                tambahSiswa(nama);
            } else if (jenisPerintah[i].equals("MATPEL")) {
                String matpel = jenisPerintah[i + 1];
                tambahMatpel(matpel);
            } else if (jenisPerintah[i].equals("NILAI")) {
                String nama = jenisPerintah[i + 1];
                String semester = jenisPerintah[i + 2];
                String martep = jenisPerintah[i + 3];

            }
        }
        
    }

//    public static String konversiNilai(double nilai){
//
//    }
    public static void tambahSiswa(String nama){
        if (banyakSiswa<MAX_SISWA) {
            siswa[banyakSiswa] = nama;
            for (int i=0;i<=banyakSiswaMatpel;i++) {
                siswaMatpel[banyakSiswa][0][i] = nama;
                siswaMatpel[banyakSiswa][1][i] = nama;
            }
            banyakSiswa++;
        }
    }
    public static void tambahMatpel(String matpel) {
        if (banyakSiswaMatpel < MAX_SISWA) {
            for (int i = 0; i <= banyakSiswaMatpel; i++) {
                siswaMatpel[i][0][banyakSiswaMatpel] = matpel;
                siswaMatpel[i][1][banyakSiswaMatpel] = matpel;
            }
            banyakSiswaMatpel++;
        }
    }
//    public static int cariSiswa(String nama){
//    }
//    public static int cariMatpel(String matpel){
//    }
    /*
    nama: nama siswa
    semester: semester, 0 untuk ganjil, 1 untuk genap
    matpel: nama matpel
    nilai: nilai matpel tiap semester
    */
    public static void isiDataSiswa(String nama, int semester, String matpel, int nilai){
    }
    public static void printSiswa(){
        System.out.print("SISWA: ");
        for(int i=0;i<banyakSiswa;i++){
            System.out.print(siswa[i] + " ");
        }
        System.out.println("");
    }
    public static void printMatpel(){
        System.out.print("MATA PELAJARAN: ");
        for(int i=0;i<banyakSiswaMatpel;i++){
            System.out.print(banyakSiswaMatpel[i] + " ");
        }
        System.out.println("");
    }
    public static void printRaportSiswa(String nama){
    }
//    public static int cariJuara(int semester){
//    }
    public static void hitungNilai(int semester){
    }
}
