import java.util.Scanner;

public class LinearSearch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key = 20;
        int hasil = 0;
        int jumElemenArray = 0;
        boolean isFound = false;

        System.out.print("Masukkan jumlah elemen array: ");
        jumElemenArray = sc.nextInt();

        int[] arrayInt = new int[jumElemenArray];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int j = 0; j < arrayInt.length; j++) {
            if (arrayInt[j] == key) {
                hasil = j;
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }

    }
}
