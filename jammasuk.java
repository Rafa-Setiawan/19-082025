package buaul;

import java.util.Scanner;

public class jammasuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jam masuk: ");
        int jamMasuk = input.nextInt();

        if(jamMasuk > 6) {
            System.out.println("Anda terlambat masuk kerja.");
        }else{

        System.out.println("anda masuk tepat waktu");

        }
        System.out.println("terimakasih.");
    }
    
}
