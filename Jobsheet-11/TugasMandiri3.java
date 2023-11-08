import java.util.Scanner;

public class TugasMandiri3 {
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

        for (int i = 1; i <= N; i++) {
            if (i == 1 || i == N) {
                for (int j = 1; j <= N; j++) {
                    System.out.printf("%d ", N);
                }
            } else {
                for (int j = 1; j <= N; j++) {
                    if (j == 1 || j == N) {
                        System.out.printf("%d ", N);
                    } else {
                        for (int k = 0; k <= Integer.toString(N).length(); k++) {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
