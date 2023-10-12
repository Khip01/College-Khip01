import java.util.Scanner;

public class WhileKelipatan02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, total = 0, counter = 0;
        double rataRata;

        System.out.print("Masukkan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan dari %d dari 1 sampai 50 adalah %d\n", kelipatan, total);

        // Menghitung rata-rata dari seluruh bilangan kelipatan yang ditentukan
        rataRata = (double)total / (double)counter;
        System.out.printf("Rata-rata dari seluruh bilangan kelipatan yang ditentukan adalah %f", rataRata);
    }

}
