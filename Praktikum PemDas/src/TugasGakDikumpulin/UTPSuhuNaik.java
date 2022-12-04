package TugasGakDikumpulin;

import java.util.Scanner;

public class UTPSuhuNaik {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int x,y,z;

        x = nc.nextInt(); y = nc.nextInt(); z = nc.nextInt();

        if (x<y && y<z && x<z){
            System.out.println("naik");
        }
        else if (x>y && y>z && x>z){
            System.out.println("turun");
        }
        else {
            System.out.println("tidak naik atau turun");
        }
    }
}


