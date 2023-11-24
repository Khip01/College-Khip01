import java.util.Scanner;

public class UcapanTerimaKasih_02 {
    
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan();
    }

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(){
        String nama = PenerimaUcapan();
        System.out.println("Terima kasih "+nama+" sudah menciptakan jobsheet-jobsheet ini, saya sangat senang sekali :)");
    }
}
