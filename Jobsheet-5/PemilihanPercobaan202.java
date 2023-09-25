import java.util.Scanner;

public class PemilihanPercobaan202 {
    
    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        System.out.print("Nilai uas   : ");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input02.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input02.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input02.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = "+total+" sehingga "+message);
        
        // Menambahkan nilai huruf
        String nilaiHuruf;

        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
        } else if( total > 73 && total <= 80){
            nilaiHuruf = "B+";
        } else if( total > 65 && total <= 73){
            nilaiHuruf = "B";
        } else if( total > 60 && total <= 65){
            nilaiHuruf = "C+";
        } else if( total > 50 && total <= 60){
            nilaiHuruf = "C";
        } else if( total > 39 && total <= 50){
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai huruf yang didapatkan adalah : "+nilaiHuruf);
    }

}
