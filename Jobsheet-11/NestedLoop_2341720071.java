import java.util.Scanner;

public class NestedLoop_2341720071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[][] temps = new Double[5][7];

        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i); 
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = input.nextDouble();
            } 
            System.out.println();
        }
        
        int i = 0;
        for (Double[] outer : temps) { 
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (Double inner : outer) {
              System.out.print(inner+" ");  
            } 
            System.out.println();
            i++;
        }

        Double rata2 = 0.0; 
        int j = 0;
        for (Double[] outer : temps) {
            System.out.print("Rata-rata Kota ke-"+j+": ");
            for (Double inner : outer) {
                rata2 += inner;
            }
            rata2 /= outer.length;
            System.out.println(rata2);
            j++;
        }

    }
}
