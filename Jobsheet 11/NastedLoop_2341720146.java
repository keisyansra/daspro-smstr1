import java.util.Scanner;
public class NastedLoop_2341720146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println(temps[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}