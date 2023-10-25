import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs= new int[10];
        double totalNilaiLulus = 0, totalNilaiTdkLulus = 0;
        double rataNilaiLulus = 0, rataNilaiTdkLulus = 0;
        int inputJumMhs, jumMhsLulus = 0, jumMhsTdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        inputJumMhs = sc.nextInt();
        
        for (int i = 0; i < inputJumMhs; i++) {
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < inputJumMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalNilaiLulus += nilaiMhs[i];
                jumMhsLulus++;
            } else {
                totalNilaiTdkLulus += nilaiMhs[i];
                jumMhsTdkLulus++;
            }
        }

        rataNilaiLulus = totalNilaiLulus/(double)jumMhsLulus;
        rataNilaiTdkLulus = totalNilaiTdkLulus/(double)jumMhsTdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rataNilaiLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataNilaiTdkLulus);
    }
}
