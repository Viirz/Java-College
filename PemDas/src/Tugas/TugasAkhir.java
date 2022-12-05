package Tugas;

import java.sql.SQLOutput;
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
        for (int j = 0; j < perintah.length; j++) {
            if (perintah[j]==null)
                continue;
            String[] jenisPerintah = perintah[j].split(" ");
            switch (jenisPerintah[0]) {
                case "SISWA" -> {
                    String nama = jenisPerintah[1];
                    tambahSiswa(nama);
                    break;
                }
                case "MATPEL" -> {
                    String matpel = jenisPerintah[1];
                    tambahMatpel(matpel);
                    break;
                }
                case "NILAI" -> {
                    String nama = jenisPerintah[1];
                    String semestberapa = jenisPerintah[2];
                    int semester = 0;
                    if (semestberapa.equals("GENAP"))
                        semester = 1;
                    String matpel = jenisPerintah[3];
                    int nilai = Integer.parseInt(jenisPerintah[4]);
                    isiDataSiswa(nama,semester,matpel,nilai);
                    break;
                }
                case "PRINT_SISWA" -> printSiswa();
                case "PRINT_MATPEL" -> printMatpel();
                case "PRINT_RAPORT" -> {
                    String nama = jenisPerintah[1];
                    printRaportSiswa(nama);
                }
            }
        }
        
    }

//    public static String konversiNilai(double nilai){
//
//    }
    public static void tambahSiswa(String nama){
        if (banyakSiswa<MAX_SISWA) {
            siswa[banyakSiswa] = nama;
            banyakSiswa++;
        }
    }
    public static void tambahMatpel(String matpel) {
        if (banyakSiswaMatpel < MAX_MATPEL) {
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
        for (int i=0;i<MAX_MATPEL;i++){
            for (int j=0;j<MAX_MATPEL;j++) {
            if (nama.equals(siswa[i])) {
                switch (semester) {
                    case 0 -> {
                        if (matpel.equals(siswaMatpel[i][0][j]))
                            siswaMatpelNilai[i][0][j] = nilai;
                        }
                    case 1 -> {
                        if (matpel.equals(siswaMatpel[i][1][j]))
                            siswaMatpelNilai[i][1][j] = nilai;
                        }
                    }
                }
            }
        }
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
            System.out.print(siswaMatpel[0][0][i] + " ");
        }
        System.out.println("");
    }
    public static void printRaportSiswa(String nama){
        String nilaiHuruf = "";
        System.out.println(">> BEGIN RAPORT <<\n");
        System.out.println("Nama: " + nama);
        System.out.println("Semester: Ganjil");
        System.out.printf("%-20s|","Mata Pelajaran");
        System.out.printf("%10s|","Nilai");
        System.out.printf("%10s\n","Nilai Huruf");
        System.out.println("-------------------------------------------");
        for(int i=0;i<=banyakSiswa;i++) {
            System.out.printf("%-20s|",siswaMatpel[0][0][i]);
            for (int j = 0; j <= banyakSiswaMatpel; j++) {
                System.out.printf("%10.1f|",siswaMatpelNilai[i][0][j]);
                if (siswaMatpelNilai[i][0][j] > 80){
                    nilaiHuruf = "A";
                } else if (siswaMatpelNilai[i][0][j] > 75 && siswaMatpelNilai[i][0][j] <= 80) {
                    nilaiHuruf = "B+";
                } else if (siswaMatpelNilai[i][0][j] > 69 && siswaMatpelNilai[i][0][j] <= 75) {
                    nilaiHuruf = "B";
                } else if (siswaMatpelNilai[i][0][j] > 65 && siswaMatpelNilai[i][0][j] <= 69) {
                    nilaiHuruf = "C+";
                } else if (siswaMatpelNilai[i][0][j] > 59 && siswaMatpelNilai[i][0][j] <= 65) {
                    nilaiHuruf = "C";
                } else if (siswaMatpelNilai[i][0][j] > 55 && siswaMatpelNilai[i][0][j] <= 59) {
                    nilaiHuruf = "D+";
                } else if (siswaMatpelNilai[i][0][j] > 40 && siswaMatpelNilai[i][0][j] <= 55) {
                    nilaiHuruf = "D+";
                } else
                    nilaiHuruf = "E";
            }
            System.out.printf("%10s\n",nilaiHuruf);
        }
        System.out.println("");
        System.out.println("Nama: " + nama);
        System.out.println("Semester: Genap");
        System.out.printf("%-20s|","Mata Pelajaran");
        System.out.printf("%10s|","Nilai");
        System.out.printf("%10s\n","Nilai Huruf");
        System.out.println("-------------------------------------------");
        for(int i=0;i<=banyakSiswa;i++) {
            System.out.printf("%-20s|",siswaMatpel[0][1][i]);
            for (int j = 0; j <= banyakSiswaMatpel; j++) {
                System.out.printf("%10.1f|",siswaMatpelNilai[i][1][j]);
                if (siswaMatpelNilai[i][1][j] > 80){
                    nilaiHuruf = "A";
                } else if (siswaMatpelNilai[i][1][j] > 75 && siswaMatpelNilai[i][1][j] <= 80) {
                    nilaiHuruf = "B+";
                } else if (siswaMatpelNilai[i][1][j] > 69 && siswaMatpelNilai[i][1][j] <= 75) {
                    nilaiHuruf = "B";
                } else if (siswaMatpelNilai[i][1][j] > 65 && siswaMatpelNilai[i][1][j] <= 69) {
                    nilaiHuruf = "C+";
                } else if (siswaMatpelNilai[i][1][j] > 59 && siswaMatpelNilai[i][1][j] <= 65) {
                    nilaiHuruf = "C";
                } else if (siswaMatpelNilai[i][0][j] > 55 && siswaMatpelNilai[i][1][j] <= 59) {
                    nilaiHuruf = "D+";
                } else if (siswaMatpelNilai[i][0][j] > 40 && siswaMatpelNilai[i][1][j] <= 55) {
                    nilaiHuruf = "D+";
                } else
                    nilaiHuruf = "E";
            }
            System.out.printf("%10s\n",nilaiHuruf);
        }
        System.out.println("");
        System.out.println(">> END RAPORT <<");
    }
//    public static int cariJuara(int semester){
//    }
    public static void hitungNilai(int semester){
    }
}
