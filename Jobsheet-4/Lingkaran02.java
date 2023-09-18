import java.util.Scanner;

/**
 * Lingkaran02
 */
public class Lingkaran02 {

    public static void main(String[] args) {
        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declaration
        int r;
        double keliling, luas, phi = 3.14;

        // Input user
        System.out.println("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();

        // Rumus Menghitung Keliling
        keliling = 2 * phi * r;
        luas = phi * r * r;

        // Output
        System.out.println(keliling);
        System.out.println(luas);

    }

}