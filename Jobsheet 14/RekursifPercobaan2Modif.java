import java.util.Scanner;

public class RekursifPercobaan2Modif {
    static int hitungPangkat(int x, int y, int originalY) {
        if (y == 0) {
            return 1;
        } else {
            int result = x * hitungPangkat(x, y - 1, originalY);
            if (y == originalY) {
                System.out.print(x);
            } else {
                System.out.print("x" + x);
            }
            if (y == 1) {
                System.out.print(" = " + result);
            } else {
                System.out.print("x");
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;
        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        pangkat = sc.nextInt();
        System.out.print("Deret perhitungan pangkatnya: ");
        int hasil = hitungPangkat(bilangan, pangkat, pangkat);
        System.out.println(); // Pindah ke baris baru setelah deret perhitungan
        System.out.println("Hasil: " + hasil);
    }
}
