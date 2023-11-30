/**
 * Percobaan1
 */
public class Percobaan1 {

    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n - 1));
        }
    }
}