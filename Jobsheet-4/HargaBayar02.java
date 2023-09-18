import java.util.Scanner;

public class HargaBayar02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jumHalBuku;
        double dis, total, bayar, jmlDis;
        String merk;

        System.out.println("Masukkan merk buku yang dibeli ");
        merk = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jumHalBuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan diskon dari barang yang dibeli ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Merk dari buku yang dibeli adalah " +merk);
        System.out.println("Jumlah halaman buku ada " +jumHalBuku);
        System.out.println("Diskon ang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }

}
