import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();

        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
        } else {
            for (int i = N; i >= 1; i--) {
                // Mencetak bintang sebanyak i
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                
                System.out.println();
            }
        }

        sc.close();
    }
}
