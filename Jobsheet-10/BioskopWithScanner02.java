import java.util.Scanner;

public class BioskopWithScanner02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom, menuInput;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("$> ");
            menuInput = input.nextInt();
            System.out.println();

            switch (menuInput) {
                case 1:
                    input.nextLine();
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = input.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = input.nextInt();
                        input.nextLine();
    
                        // Menghandle apakah nomor baris/kolom tidak tersedia 
                        if(baris >= penonton.length || kolom >= penonton[baris].length){
                            System.out.println("\nMaaf baris/kolom melebihi batas");
                            continue;
                        }
    
                        // warning kursi sudah terisi
                        if (penonton[baris-1][kolom-1] != null){
                            System.out.println("\nKursi sudah terisi!\nSilahkan masukkan kolom dan baris kembali!");
                            continue;
                        }
    
                        penonton[baris-1][kolom-1] = nama;
    
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = input.nextLine();
    
                        if (next.equalsIgnoreCase("n")) {
                            System.out.println();
                            break;
                        }
                        System.out.println();
                    } while (true);
                    break;
                case 2:
                    System.out.println("\n       1     2");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("  "+(i+1)+"  ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("["+"***"+"] ");
                                continue;
                            }
                            System.out.print("["+penonton[i][j]+"] ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    
                    return;
                default:
                System.out.println("Pilih menu dengan benar");
                break;
            }
        }

    }

}
