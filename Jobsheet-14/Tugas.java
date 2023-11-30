import java.util.Scanner;

public class Tugas {
    //// TUGAS NO 4
    // Berapa pasangan marmut yang ada pada akhir bulan ke-12? 
    // Buatlah programnya menggunakan fungsi rekursif! (Fibonacci)
    // 1 + (1 + (2 + (3) + (5)))
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