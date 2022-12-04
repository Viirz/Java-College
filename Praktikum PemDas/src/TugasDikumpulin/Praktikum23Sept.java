package TugasDikumpulin;

public class Praktikum23Sept {

    public static void main(String[] args) {
        String Nama = "Bpk Asisten" ;
        String Kelurahan = "Java" ;
        int posisiAwalKwhMeter = 8000;
        int posisiAkhirKwhMeter = 9000;
        int biayaBebanSaatIni = 140;
        int ppjdalampersen = 10;
        int pemakaianBulanIni = (posisiAkhirKwhMeter - posisiAwalKwhMeter);
        int tarif = ((posisiAkhirKwhMeter - posisiAwalKwhMeter) * biayaBebanSaatIni) ;
        int ppj = (tarif/10) ;
        int total = (tarif+ppj) ;

        System.out.println("Program Penghitung Pemakaian Listrik Sederhana");
        System.out.println("Masukkan nama \t\t\t\t\t : " + Nama);
        System.out.println("Kelurahan \t\t\t\t\t\t : " + Kelurahan);
        System.out.println("Masukkan posisi awal Kwh Meter \t : " + posisiAwalKwhMeter);
        System.out.println("Masukkan posisi akhir Kwh Meter  : " + posisiAkhirKwhMeter);
        System.out.println("Masukkan biaya beban saat ini \t : " + biayaBebanSaatIni);
        System.out.println("Masukkan PPJ (dalam persen) \t : " + ppjdalampersen);

        System.out.println("====================PLN JAVA====================");
        System.out.println("Nama \t\t\t\t : " + Nama);
        System.out.println("Kelurahan \t\t\t : " + Kelurahan);
        System.out.println("Pemakaian bulan ini  : " + pemakaianBulanIni + " Kwh Meter");
        System.out.println("Tarif Listrik \t\t : Rp " + tarif + ",-");
        System.out.println("PPJ 10% \t\t\t : Rp " + ppj + ",-");
        System.out.println("Total Bayar \t\t : Rp " + total + ",-");

    }
}
