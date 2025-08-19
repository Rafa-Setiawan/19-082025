package buaul;

import java.util.Scanner;

public class usia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan usia anda: ");
        int usia = input.nextInt();

        if (usia >= 5 && usia <= 9) {
            System.out.println("Anda masih anak-anak");
        
        }
        else if (usia >= 9 && usia < 18) {
            System.out.println("Anda sudah remaja");
        }
        else if (usia >= 18 && usia < 60) {
            System.out.println("Anda sudah dewasa");
        }
        else if (usia >= 60) {
            System.out.println("Anda sudah lansia");  
            
        }else {
                System.out.println("Usia tidak valid");
            }
    }
}
