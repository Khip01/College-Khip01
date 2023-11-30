import java.util.Scanner;

public class Tugas {
    // Menampilkan n sampai 0
    static void deretDescendingRekursif(int n){
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.print(n+", ");
            deretDescendingRekursif(n-1);
        }
    }

    static void deretDescendingIteratif(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i == 0 ? i : i+", ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("masukkan n: ");
        n = input.nextInt();

        System.out.println("Fungsi Rekursif");
        deretDescendingRekursif(n);
        System.out.println("Fungsi Iteratif");
        deretDescendingIteratif(n);
    }
}