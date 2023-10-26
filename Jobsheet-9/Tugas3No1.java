import java.util.Scanner;

public class Tugas3No1 {
    public static void main(String[] args) {
        /*
         * Buat program untuk menghasilkan nilai tertinggi, nilai terendah, dan rata-rata 
         * dari suatu array berisi bilangan bertipe integer. 
         * Ketentuan: 
         *   − Input: Banyaknya elemen, nilai tiap elemen 
         *   − Output: Nilai tertinggi, nilai terendah, nilai rata-rata
         */

        // Deklarasi var
        Scanner input = new Scanner(System.in);
        int inputUser, nilaiTerbesar, nilaiTerkecil, nilaiTotal = 0;
        double nilaiRata;


        // Input User
        System.out.print("Masukkan banyak elemen: ");
        inputUser = input.nextInt();

        // Deklarasi banyak elemen array
        int[] arrayNilai = new int[inputUser];

        // Looping input 
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan input elemen ke-"+i+" : ");
            arrayNilai[i] = input.nextInt();
        }

        
        // Deklarasi awal Nilai Terbesar dan Nilai Terkecil, dan Nilai Total awal
        nilaiTerbesar = arrayNilai[0];
        nilaiTerkecil = arrayNilai[0];
        nilaiTotal += arrayNilai[0];

        // Looping Search Nilai Tertinggi dan Terendah, dan Jumlah Nilai Seluruh Elemen
        for (int i = 1; i < arrayNilai.length; i++) {
            // Menyimpan Nilai Tertinggi 
            if (nilaiTerbesar < arrayNilai[i]) {
                nilaiTerbesar = arrayNilai[i];
            }
            // Menyimpan Nilai Terendah 
            if (nilaiTerkecil > arrayNilai[i]) {
                nilaiTerkecil = arrayNilai[i];
            }
            // Jumlah Nilai seluruh Elemen
            nilaiTotal += arrayNilai[i];
        }


        // Mencari Nilai Rata-rata 
        nilaiRata = (double)nilaiTotal / (double)arrayNilai.length;


        // Final Output
        System.out.println("Nilai tertinggi dari seluruh elemen adalah "+nilaiTerbesar);
        System.out.println("Nilai terendah dari seluruh elemen adalah "+nilaiTerkecil);
        System.out.println("Rata-rata nilai dari seluruh elemen adalah "+nilaiRata);
    }
}
