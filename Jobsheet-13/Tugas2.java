import java.util.Scanner;

public class Tugas2 {
    // static int dataNilai[][] = {{20, 19, 25, 20, 10, 0, 10}, {30, 30, 40, 10, 15, 20, 25}, {5, 0, 20, 25, 10, 5, 45}, {50, 0, 7, 8, 0, 30, 60}, {15, 10, 16, 15, 10, 10, 5}};
    static Scanner input = new Scanner(System.in);
    static int dataNilai[][];
    static String namaMhs[];


    static void inputNamaMhs(int jumMhs){
        input.nextLine();
        String[] arrayInput = new String[jumMhs];
        namaMhs = arrayInput;

        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke "+(i+1)+": ");
            namaMhs[i] = input.nextLine();
        }
    }

    static void inputDataMhs(int[][] arrayInput){
        dataNilai = arrayInput;
        for (int i = 0; i < dataNilai.length; i++) {
            for (int j = 0; j < dataNilai[i].length; j++) {
                System.out.print("Nilai "+namaMhs[i]+" minggu ke-"+(j+1)+" : ");
                dataNilai[i][j] = input.nextInt();
            }
        }
    }

    static void tampilDataMhs(int jumMinggu){
        System.out.print("\t");
        for (int i = 0; i < jumMinggu; i++) {
            System.out.print("\tMinggu ke-"+(i+1));
        }
        System.out.println();
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.print(namaMhs[i]+"\t\t");
            for (int j = 0; j < dataNilai[i].length; j++) {
                System.out.print(dataNilai[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    static void searchNilaiTertinggi(){
        int nilaiTertinggi = dataNilai[0][0], mingguKe = 1;

        for (int i = 0; i < dataNilai.length; i++) {
            for (int j = 1; j < dataNilai[i].length; j++) {
                if (dataNilai[i][j] > nilaiTertinggi) {
                    mingguKe = j+1;
                }
            }
        }

        System.out.println("Nilai tertinggi terdapat pada Minggu ke "+mingguKe);
    }

    static void searchNamaNilaiMinggu(){
        int nilaiTertinggi = dataNilai[0][0], mingguKe = 1, indexMhs = 0;

        for (int i = 0; i < dataNilai.length; i++) {
            for (int j = 1; j < dataNilai[i].length; j++) {
                if (dataNilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = dataNilai[i][j];
                    mingguKe = j+1;
                    indexMhs = i;
                }
            }
        }

        System.out.println("Nilai tertinggi diperoleh oleh "+namaMhs[indexMhs]+" dengan nilai "+nilaiTertinggi+" Minggu ke "+mingguKe);
    }

    public static void main(String[] args) {
        int jumlahMhs, jumlahMinggu;

        System.out.print("Masukkan jumlah Mahasiswa: ");
        jumlahMhs = input.nextInt();
        inputNamaMhs(jumlahMhs);

        System.out.print("Masukkan jumlah Minggu/Tugas: ");
        jumlahMinggu = input.nextInt();

        int dataNilai[][] = new int[jumlahMhs][jumlahMinggu];

        inputDataMhs(dataNilai);
        tampilDataMhs(jumlahMinggu);
        searchNilaiTertinggi();
        searchNamaNilaiMinggu();
    }
}
