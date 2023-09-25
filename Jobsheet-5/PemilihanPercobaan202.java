import java.util.Scanner;

public class PemilihanPercobaan202 {
    
    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        System.out.println("Nilai uas   : ");
        float uas = input02.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input02.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input02.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input02.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        
    }

}
