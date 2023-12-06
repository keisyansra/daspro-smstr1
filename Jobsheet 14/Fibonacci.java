import java.util.Scanner;

public class Fibonacci {
    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke-: ");
        int bulan = sc.nextInt();

        int hasil = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + ": " + hasil);

        sc.close();
    }
}
