import java.util.Scanner;

public class BioskopWithScanner02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        System.out.println("Menu 1: Input data penonton");
        System.out.println("Menu 2: Tampilkan daftar penonton");
        System.out.println("Menu 3: Exit");

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input.nextInt();
            input.nextLine();

            // Menghandle apakah nomor baris/kolom tidak tersedia 
            if(baris >= penonton.length || kolom >= penonton[baris].length){
                System.out.println("Maaf baris/kolom melebihi batas");
                break;
            }

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }


    }

}
