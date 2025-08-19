package buaul;

import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai anda: ");
        int nilai = input.nextInt();

        if (nilai >= 0 && nilai <= 54) {
            System.out.println("nilai anda "+nilai);
            System.out.println("Predikat nilai D: Kurang");
        
        }
        else if (nilai >= 55 && nilai < 59) {
            System.out.println("nilai anda "+nilai);
            System.out.println("Predikat nilai D+: Kurang baik");
        }
        else if (nilai >= 60 && nilai < 64) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai C- : Cukup");
        }
        else if (nilai >= 65 && nilai < 69) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai C : Cukup");
        }
        else if (nilai >= 70 && nilai < 74) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai C+ : Cukup");
        }
        else if (nilai >= 75 && nilai < 80) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai B- : Baik");
        }
    
        else if (nilai >= 81 && nilai < 85) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai B : Baik");
        }
        
        else if (nilai >= 86 && nilai < 90) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai B+ : Baik");
        }
        else if (nilai >= 91 && nilai < 95) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai A- : Sangat Baik");
        }
        else if (nilai  >= 96&& nilai <= 100) {
            System.out.println("nilai anda "+nilai);
            System.out.println("predikat nilai A : Sangat Baik");  
       
            }
        else {            System.out.println("Nilai tidak valid. Silakan masukkan nilai antara 0 dan 100.");
        }
            
            
    }
}
