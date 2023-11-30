import java.util.Scanner;

public class Tugas {
    //// TUGAS NO 1
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

    //// TUGAS NO 2
    // Menghitung penjumlahan bilangan. Misalnya f = 8, 
    // maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36
    static int penjumlahanRekursif(int f){
        if (f == 1) {
            return (1);
        } else {
            return (f + penjumlahanRekursif(f-1));
        }
    }

    //// TUGAS NO 3
    // mengecek apakah suatu bilangan n merupakan 
    // bilangan prima atau bukan.
    static boolean cekPrimaRekursif(int n, int m){
        if (n == m) {
            m = n-1;
        }
        if (m == 1) {
            return true;
        } else if (n % m == 0) {
            return false;
        } else {
            return cekPrimaRekursif(n, m-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("masukkan n: ");
        n = input.nextInt();

        System.out.println("Fungsi Rekursif");
        System.out.println("Apakah dia prima? "+cekPrimaRekursif(n, n));
    }
}