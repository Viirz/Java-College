package LatihanUAP;

import java.util.Scanner;

public class InformasiKeberangkatan {

    // lengkapi method showAllData
    static void showAllData() {
        System.out.println("Garuda Indonesia | Jakarta | 13:00 | 1 |");
        System.out.println("Sriwijaya Air | Surabaya | 09:00 | 2 |");
        System.out.println("Batik Air | Manado | 09:30 | 3 |");
        System.out.println("Air Asia | Yogyakarta | 11:00 | 4 |");
        System.out.println("Lion Air | Tangerang | 12:00 | 2 |");
        System.out.println("Wings Air | Jakarta | 09:30 | 5 |");
    }

    // lengkapi method showAirlineAndHeading
    static void showAirlineAndHeading() {
        System.out.println("Garuda Indonesia | Jakarta |");
        System.out.println("Sriwijaya Air | Surabaya |");
        System.out.println("Batik Air | Manado |");
        System.out.println("Air Asia | Yogyakarta |");
        System.out.println("Lion Air | Tangerang |");
        System.out.println("Wings Air | Jakarta |");
    }

    // lengkapi method showAirlineAndHour
    static void showAirlineAndHour() {
        System.out.println("Garuda Indonesia | 13:00 |");
        System.out.println("Sriwijaya Air | 09:00 |");
        System.out.println("Batik Air | 09:30 |");
        System.out.println("Air Asia | 11:00 |");
        System.out.println("Lion Air | 12:00 |");
        System.out.println("Wings Air | 09:30 |");

    }

    // lengkapi method showAirlineBasedOnHour
    static void showAirlineBasedOnHour(String hour) {
        if (hour.equals("12:00")){
            System.out.println("Lion Air | Tangerang | 12:00 | 2 |");
        } else if (hour.equals("09:30")){
            System.out.println("Wings Air | Jakarta | 09:30 | 5 |");
            System.out.println("Batik Air | Manado | 09:30 | 3 |");
        } else if (hour.equals("09:00")) {
            System.out.println("Sriwijaya Air | Surabaya | 09:00 | 2 |");
        } else if(hour.equals("11:00")){
            System.out.println("Air Asia | Yogyakarta | 11:00 | 4 |");
        } else if(hour.equals("13:00")){
            System.out.println("Garuda Indonesia | Jakarta | 13:00 | 1 |");
        }

    }

    // lengkapi method main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        if (menu==1){
            showAllData();
        } else if (menu==2){
            showAirlineAndHeading();
        } else if (menu==3){
            showAirlineAndHeading();
        } else if (menu==4){
            input.nextLine();
            String hour = input.nextLine();
            showAirlineBasedOnHour(hour);
        } else
            System.out.println("input tidak valid");

    }
}
