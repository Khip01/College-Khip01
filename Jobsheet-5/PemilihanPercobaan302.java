import java.util.Scanner;

public class PemilihanPercobaan302 {
    
    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input02.nextDouble();
        System.out.print("masukkan angka kedua: ");
        angka2 = input02.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input02.next().charAt(0);

    }

}
