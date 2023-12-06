import java.util.Scanner;

public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + hitungPenjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int hasil = hitungPenjumlahan(n);
        System.out.println("Penjumlahan 1+2+...+" + n + " = " + hasil);

        sc.close();
    }
}
