import java.util.Scanner;
/**
 * PemilihanPercobaan102
 */
public class PemilihanPercobaan102 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
    
        System.out.print("Masukkan angka: ");
        int angka = input02.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        } else {
            System.out.println("Angka "+angka+" bilangan ganjil");
        }

    }

}