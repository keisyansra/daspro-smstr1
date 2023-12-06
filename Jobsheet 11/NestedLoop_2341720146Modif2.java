import java.util.Scanner;

public class NestedLoop_2341720146Modif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[5][7];
        double[] cityAverages = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            int totalTemp = 0;

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
                totalTemp += temps[i][j];
            }
            cityAverages[i] = (double) totalTemp / temps[0].length;

            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (int temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println("Rata-rata: " + cityAverages[i]);
            System.out.println();
        }

        sc.close();
    }
}
