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

    //// TUGAS NO 4
    // Berapa pasangan marmut yang ada pada akhir bulan ke-12? 
    // Buatlah programnya menggunakan fungsi rekursif! (Fibonacci)
    // 1 + (1 + (2 + (3 + (5))))
    static int fibonacciMarmut(int bulan, int pasangan, int pasanganBefore){
        if (bulan == 1) {
            return pasangan;
        } else {
            return fibonacciMarmut(bulan-1, pasangan + pasanganBefore, pasangan);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bulan, hasil;

        System.out.print("masukkan bulan: ");
        bulan = input.nextInt();

        System.out.println("Fungsi Rekursif");
        // Nilai default param pasangan = 1 dan pasangan before = 0 untuk deklarasi bulan ke 1
        hasil = fibonacciMarmut(bulan, 1, 0);
        System.out.println("Total Pasangan di bulan ke-"+bulan+" adalah "+hasil);
    }
}