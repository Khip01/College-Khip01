public class Kubus02 {
    static int hitungVolumKubus(int sisi){
        return (sisi * sisi * sisi);
    }

    public static void main(String[] args) {
        int sisi = 10;
        System.out.println("Volume dari kubus bersisi " + sisi + " = " + hitungVolumKubus(sisi));
    }
}
