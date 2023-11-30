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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f;

        System.out.print("masukkan f: ");
        f = input.nextInt();

        System.out.println("Fungsi Rekursif");
        System.out.println("Hasil = "+penjumlahanRekursif(f));
    }
}