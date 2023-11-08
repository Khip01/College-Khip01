import java.util.Scanner;

public class TugasMandiri2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;

        // Segitiga dengan Angka
        do {
            System.out.print("Masukkan angka N(minimal 5): ");
            N = input.nextInt();
            if (N < 5) {
                System.out.println("\nKESALAHAN: angka minimal 5!");
            } else {
                System.out.println();
                break;
            }
        } while (true);

        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
