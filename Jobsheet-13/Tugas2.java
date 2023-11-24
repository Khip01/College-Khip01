import java.util.Scanner;

public class Tugas2 {
    // static int dataNilai[][] = new int[5][7];
    static int dataNilai[][] = {{20, 19, 25, 20, 10, 0, 10}, {30, 30, 40, 10, 15, 20, 25}, {5, 0, 20, 25, 10, 5, 45}, {50, 0, 7, 8, 0, 30, 60}, {15, 10, 16, 15, 10, 10, 5}};
    static Scanner input = new Scanner(System.in);

    static void inputDataMhs(){
        for (int i = 0; i < dataNilai.length; i++) {
            for (int j = 0; j < dataNilai[i].length; j++) {
                System.out.print("Baris ke "+(i+1)+" minggu ke-"+(j+1)+" : ");
                dataNilai[i][j] = input.nextInt();
            }
        }
    }

    static void tampilDataMhs(){
        System.out.println("\t\tMinggu ke-1\tMinggu ke-2\tMinggu ke-3\tMinggu ke-4\tMinggu ke-5\tMinggu ke-6\tMinggu ke-7");
        for (int i = 0; i < dataNilai.length; i++) {
            if (i == 0) {
                System.out.print("Sari\t\t");
            } else if (i == 1) {
                System.out.print("Rina\t\t");
            } else if (i == 2) {
                System.out.print("Yani\t\t");
            } else if (i == 3) {
                System.out.print("Dwi\t\t");
            } else if (i == 4) {
                System.out.print("Lusi\t\t");
            }
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
        int nilaiTertinggi = dataNilai[0][0], mingguKe = 1, indexMhs = 1;

        for (int i = 0; i < dataNilai.length; i++) {
            for (int j = 1; j < dataNilai[i].length; j++) {
                if (dataNilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = dataNilai[i][j];
                    mingguKe = j+1;
                    indexMhs = i+1;
                }
            }
        }

        switch (indexMhs) {
            case 1:
                System.out.println("Nilai tertinggi diperoleh oleh Sari dengan nilai "+nilaiTertinggi+" Minggu ke "+mingguKe);
                break;
            case 2:
                System.out.println("Nilai tertinggi diperoleh oleh Rina dengan nilai "+nilaiTertinggi+" Minggu ke "+mingguKe);
                break;
            case 3:  
                System.out.println("Nilai tertinggi diperoleh oleh Yani dengan nilai "+nilaiTertinggi+" Minggu ke "+mingguKe);
                break;
            case 4:
                System.out.println("Nilai tertinggi diperoleh oleh Dwi dengan nilai "+nilaiTertinggi+" Minggu ke "+mingguKe);
                break;
            case 5:
                System.out.println("Nilai tertinggi diperoleh oleh Lusi dengan nilai "+nilaiTertinggi+" Minggu ke "+mingguKe);
                break;
        }
    }

    public static void main(String[] args) {
        // inputDataMhs();
        tampilDataMhs();
        searchNilaiTertinggi();
        searchNamaNilaiMinggu();
    }
}
