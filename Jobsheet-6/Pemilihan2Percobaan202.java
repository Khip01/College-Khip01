import java.util.Scanner;

public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        // Perintah memasukkan input dari user
        System.out.print("Masukkan sudut pertama: ");
        int sudut1 = input02.nextInt();
        System.out.print("Masukkan sudut kedua: ");
        int sudut2 = input02.nextInt();
        System.out.print("Masukkan sudut ketiga: ");
        int sudut3 = input02.nextInt();
        
        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga sikut-siku");
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else if ((sudut1 != sudut2) && (sudut2 != sudut3) && (sudut3 != sudut1))
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else 
            System.out.println("Bukan Segitiga");
    }
}
