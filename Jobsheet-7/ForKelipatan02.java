import java.util.Scanner;
/**
 * ForKelipatan02
 */
public class ForKelipatan02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, total = 0, counter = 0;

        System.out.print("Masukkan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
    }

}