/**
 Nama 1: Virgananta Saputra (NIM 225150201111028)
 Nama 2: Muhammad Nadhil Luthfirrahman (NIM 225150207111049)
 Tanggung jawab 1: mengerjakan soal c, membuat source code, format file, dan diskusi jawban d dan e
 Tanggung jawab 2: mengerjakan soal a dan b, membuat pseudocode, membuat flowchart, dan diskusi jawaban d dan e
 **/
package Tugas;

import java.util.Scanner;

public class TP_225150201111028_VirganantaSaputra_1 {
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

    public static String konversiNilai(double nilai){
        String nilaiHuruf="";
        if (nilai > 80 && nilai < 100){
            nilaiHuruf = "A";
        } else if (nilai > 75 && nilai <= 80) {
            nilaiHuruf = "B+";
        } else if (nilai > 69 && nilai <= 75) {
            nilaiHuruf = "B";
        } else if (nilai > 65 && nilai <= 69) {
            nilaiHuruf = "C+";
        } else if (nilai > 59 && nilai <= 65) {
            nilaiHuruf = "C";
        } else if (nilai > 55 && nilai <= 59) {
            nilaiHuruf = "D+";
        } else if (nilai > 40 && nilai <= 55) {
            nilaiHuruf = "D+";
        } else
            nilaiHuruf = "E";
        return nilaiHuruf;
    }
    public static void tambahSiswa(String nama){
        if (banyakSiswa<MAX_SISWA) {
            siswa[banyakSiswa] = nama;
            banyakSiswa++;
        }
    }
    public static void tambahMatpel(String matpel) {
        if (banyakSiswaMatpel < MAX_MATPEL) {
            for (int i = 0; i < MAX_SISWA; i++) {
                    siswaMatpel[i][0][banyakSiswaMatpel] = matpel;
                    siswaMatpel[i][1][banyakSiswaMatpel] = matpel;
            }
            banyakSiswaMatpel++;
        }
    }
    public static int cariSiswa(String nama){
        int indexSiswa=0;
        for(int i=0;i<banyakSiswa;i++){
            if (siswa[i].equals(nama)){
                break;
            } else indexSiswa++;
        }
        return indexSiswa;
    }
    public static int cariMatpel(String matpel){
        int indexMatpel=0;
        for (int i=0;i<banyakSiswaMatpel;i++){
            if(matpel.equals(siswaMatpel[0][0][i])){
                break;
            } else indexMatpel++;
        }
        return indexMatpel;
    }
    /*
    nama: nama siswa
    semester: semester, 0 untuk ganjil, 1 untuk genap
    matpel: nama matpel
    nilai: nilai matpel tiap semester
    */
    public static void isiDataSiswa(String nama, int semester, String matpel, int nilai){
        for (int i=0;i<banyakSiswaMatpel;i++){
        int indexSiswa = cariSiswa(nama);
        int indexMatpel = cariMatpel(matpel);
         switch (semester){
             case 0 ->{
                 siswaMatpelNilai[indexSiswa][0][indexMatpel] = nilai;
             }
             case 1 ->{
                 siswaMatpelNilai[indexSiswa][1][indexMatpel] = nilai;
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
        System.out.printf("%15s\n","Nilai Huruf");
        System.out.println("-----------------------------------------------");
        for(int i=0;i<banyakSiswaMatpel;i++) {
            int indexSiswa = cariSiswa(nama);
            nilaiHuruf = konversiNilai(siswaMatpelNilai[indexSiswa][0][i]);
            System.out.printf("%-20s|",siswaMatpel[indexSiswa][0][i]);
            System.out.printf("%10.1f|", siswaMatpelNilai[indexSiswa][0][i]);
            System.out.printf("%15s\n",nilaiHuruf);
        }
        System.out.println("");
        System.out.println("Semester: Genap");
        System.out.printf("%-20s|","Mata Pelajaran");
        System.out.printf("%10s|","Nilai");
        System.out.printf("%15s\n","Nilai Huruf");
        System.out.println("-----------------------------------------------");
        for(int j=0;j<banyakSiswaMatpel;j++) {
            int indexSiswa = cariSiswa(nama);
            nilaiHuruf = konversiNilai(siswaMatpelNilai[indexSiswa][1][j]);
            System.out.printf("%-20s|",siswaMatpel[indexSiswa][1][j]);
            System.out.printf("%10.1f|", siswaMatpelNilai[indexSiswa][1][j]);
            System.out.printf("%15s\n",nilaiHuruf);
        }
        System.out.println("\n>>END RAPORT<<");
    }
    public static int cariJuara(int semester){
        int sum=0;int nilaiTerbesar=0;
        for (int i=0;i<banyakSiswa;i++){
            sum = 0;
            for (int j=0;j<banyakSiswaMatpel;j++){
                sum += siswaMatpelNilai[i][semester][j];
            }
            if (sum>nilaiTerbesar)
                nilaiTerbesar = sum;
        }
        return nilaiTerbesar/banyakSiswaMatpel;
    }
    public static void hitungNilai(int semester){
        String nilaiHuruf = "";
        String[] isiNilaiHuruf = new String[banyakSiswaMatpel];
        String[] huruf = {"A","B+","B","C+","C","D+","D","E"};
        int counter = 0;
        for (int i=0;i<banyakSiswa;i++){
            System.out.print(siswa[i] + " ");
            for (int k=0;k<banyakSiswaMatpel;k++){
                if (siswaMatpelNilai[i][semester][k]==0)
                    continue;
                double nilai = siswaMatpelNilai[i][semester][k];
                nilaiHuruf = konversiNilai(nilai);
                isiNilaiHuruf[k] = nilaiHuruf;
            }
            for (int k=0;k< huruf.length;k++) {
                for (int l = 0; l < isiNilaiHuruf.length; l++) {
                    if (isiNilaiHuruf[l].equals(huruf[k]))
                            counter++;
                }
                if (counter > 0)
                    System.out.printf("%s:%d ", huruf[k], counter);
                counter = 0;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] perintah = new String[500];
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
                }
                case "MATPEL" -> {
                    String matpel = jenisPerintah[1];
                    tambahMatpel(matpel);
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
                }
                case "PRINT_SISWA" -> printSiswa();
                case "PRINT_MATPEL" -> printMatpel();
                case "PRINT_RAPORT" -> {
                    String nama = jenisPerintah[1];
                    printRaportSiswa(nama);
                }
                case "CARI_JUARA" -> {
                    String semesterBerapa = jenisPerintah[1];
                    int sum = 0;
                    int semester = 1;
                    if (semesterBerapa.equals("GANJIL")){
                        semester = 0;
                    }
                    int rerata = cariJuara(semester);
                    for (int k=0;k<banyakSiswa;k++){
                        for (int l=0;l<banyakSiswaMatpel;l++){
                            sum += siswaMatpelNilai[k][semester][l];
                        }
                        if ((sum/banyakSiswaMatpel)==rerata){
                            System.out.println("JUARA_1 " + semesterBerapa + " " + siswa[k]);
                        }
                        sum = 0;
                    }
                }
                case "HITUNG_NILAI" -> {
                    String semesterBerapa = jenisPerintah[1];
                    int semester = 1;
                    if (semesterBerapa.equals("GANJIL")){
                        semester = 0;
                    }
                    hitungNilai(semester);
                }
            }
        }
    }
}
