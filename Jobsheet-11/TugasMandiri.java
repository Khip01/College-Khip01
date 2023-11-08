import java.util.Scanner;

public class TugasMandiri {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = 0;

        // Segitiga dengan Angka
        do {
            System.out.print("Masukkan angka N(minimal 3): ");
            N = input.nextInt();
            if (N < 3) {
                System.out.println("\nKESALAHAN: angka minimal 3!");
            } else {
                System.out.println();
                break;
            }
        } while (true);

        int angka = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(angka);
                angka++;
            }
            System.out.println();
            angka = 1;
        }

    }
}
