import java.util.Scanner;

public class Gaji02 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji;
    
        System.out.println("Masukkan Besaran Gaji Anda ");
        gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk = input.nextInt();
        
        TotGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah "+TotGaji);

    }

}
