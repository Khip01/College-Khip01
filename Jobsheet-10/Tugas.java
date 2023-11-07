import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String separator = "------------------------------------------------------------------------";
        String esc = "\033[H\033[2J";
        String[][] userAccount = new String[10][2];
        // Akun default yang sudah terdaftar
        userAccount[0][0] = "Admin";
        userAccount[0][1] = "admin";

        userAccount[1][0] = "Aakhif";
        userAccount[1][1] = "password123";

        userAccount[2][0] = "Danendra";
        userAccount[2][1] = "danendrapassadhi";

        userAccount[3][0] = "Dhanil";
        userAccount[3][1] = "yakul123";

        // Variabel Login
        String usernameInput, passInput;
        boolean isAllowed = false, stillLogin = true;
        System.out.println("\nSilahkan verifikasi diri anda terlebih dahulu\n");
        System.out.println(esc);
        System.out.println(separator);

        System.out.println("Silahkan LOGIN!\n");
        do {
            System.out.print("Username: ");
            usernameInput = input.nextLine();
            System.out.print("Password: ");
            passInput = input.nextLine();

            // Mengecek apakah username terdapat pada array
            for (int i = 0; i < userAccount.length; i++) {
                if (usernameInput.equals(userAccount[i][0]) && passInput.equals(userAccount[i][1])) {
                    isAllowed = true;
                }
            }

            // Jika dia benar maka bisa login, begitu pula sebaliknya
            if (isAllowed) {
                System.out.println("\nBerhasil login!");
                System.out.println("Selamat datang " + usernameInput);
                isAllowed = false; // Reset Allowed login to false
                stillLogin = false; // Keluar dari loop validasi login

            } else {
                System.out.println(
                        "\nMaaf tidak ditemukan username dengan password tersebut\nSilahkan coba lagi!");
                stillLogin = true;
            }
        } while (stillLogin);
    }
}