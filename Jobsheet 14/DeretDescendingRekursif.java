import java.util.Scanner;

public class DeretDescendingRekursif {
    static void tampilkanDeret(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            tampilkanDeret(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.print("Deret descending rekursif: ");
        tampilkanDeret(n);

        sc.close();
    }
}
