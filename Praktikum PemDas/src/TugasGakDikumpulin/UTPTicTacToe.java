package TugasGakDikumpulin;

import java.util.Scanner;

public class UTPTicTacToe {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        String a11=nc.next();
        String a12=nc.next();
        String a13=nc.next();
        String b21=nc.next();
        String b22=nc.next();
        String b23=nc.next();
        String c31=nc.next();
        String c32=nc.next();
        String c33=nc.next();


        if(Character.compare(a11.charAt(0), a12.charAt(0))==0&&Character.compare(a12.charAt(0), a13.charAt(0))==0&&Character.compare(a11.charAt(0), a13.charAt(0))==0){
            if(Character.compare(a11.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(b21.charAt(0), b22.charAt(0))==0&&Character.compare(b22.charAt(0), b23.charAt(0))==0&&Character.compare(b21.charAt(0), b23.charAt(0))==0){
            if(Character.compare(b21.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(c31.charAt(0), c32.charAt(0))==0&&Character.compare(c32.charAt(0), c33.charAt(0))==0&&Character.compare(c31.charAt(0), c33.charAt(0))==0){
            if(Character.compare(c31.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(a11.charAt(0), b21.charAt(0))==0&&Character.compare(b21.charAt(0), c31.charAt(0))==0&&Character.compare(c31.charAt(0), a11.charAt(0))==0){
            if(Character.compare(a11.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(a11.charAt(0), b22.charAt(0))==0&&Character.compare(b22.charAt(0), c33.charAt(0))==0&&Character.compare(a11.charAt(0), c33.charAt(0))==0){
            if(Character.compare(a11.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(a12.charAt(0), b22.charAt(0))==0&&Character.compare(b22.charAt(0), c32.charAt(0))==0&&Character.compare(a12.charAt(0), c32.charAt(0))==0){
            if(Character.compare(a12.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(a13.charAt(0), b23.charAt(0))==0&&Character.compare(b23.charAt(0), c33.charAt(0))==0&&Character.compare(a13.charAt(0), c33.charAt(0))==0){
            if(Character.compare(a13.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else if(Character.compare(a13.charAt(0), b22.charAt(0))==0&&Character.compare(b22.charAt(0), c31.charAt(0))==0&&Character.compare(c31.charAt(0), a13.charAt(0))==0){
            if(Character.compare(a13.charAt(0),'O')==0){
                System.out.println("O menang");
            }else{
                System.out.println("X menang");
            }
        }else{
            System.out.println("Draw");
        }


    }
}


