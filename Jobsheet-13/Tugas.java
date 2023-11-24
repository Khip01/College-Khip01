public class Tugas {
    static String[][] listBuku = new String[15][6];

    static void TampilBuku() {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i][0] != null) {
                System.out.println(listBuku[i][0]);
                System.out.println(listBuku[i][5]);
            }
        }
    }
    public static void main(String[] args) {
        listBuku[0][0] = "Metode Penelitian Kualitatif";
        listBuku[0][1] = "312";
        listBuku[0][2] = "M. Nazir";
        listBuku[0][3] = "Akademik";
        listBuku[0][4] = "1";
        listBuku[0][5] = "5";

        listBuku[1][0] = "Ayat-Ayat Cinta";
        listBuku[1][1] = "368";
        listBuku[1][2] = "Habiburrahman El Shirazy";
        listBuku[1][3] = "Non Akademik";
        listBuku[1][4] = "2";
        listBuku[1][5] = "5";

        listBuku[2][0] = "Pengantar Sosiologi";
        listBuku[2][1] = "250";
        listBuku[2][2] = "Soerjono Soekanto";
        listBuku[2][3] = "Akademik";
        listBuku[2][4] = "3";
        listBuku[2][5] = "5";

        listBuku[3][0] = "Sebuah Pengantar";
        listBuku[3][1] = "340";
        listBuku[3][2] = "Achmad Charris Zubair";
        listBuku[3][3] = "Akademik";
        listBuku[3][4] = "4";
        listBuku[3][5] = "5";

        listBuku[4][0] = "Laskar Pelangi";
        listBuku[4][1] = "529";
        listBuku[4][2] = "Andrea Hirata";
        listBuku[4][3] = "Non Akademik";
        listBuku[4][4] = "5";
        listBuku[4][5] = "5";

        listBuku[5][0] = "Perahu Kertas";
        listBuku[5][1] = "368";
        listBuku[5][2] = "Dee Lestari";
        listBuku[5][3] = "Non Akademik";
        listBuku[5][4] = "6";
        listBuku[5][5] = "5";

        TampilBuku();
    }
}