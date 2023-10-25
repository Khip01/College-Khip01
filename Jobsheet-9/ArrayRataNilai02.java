import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2;
        int counterMhsLulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                counterMhsLulus += 1;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus = "+counterMhsLulus);
    }
}
