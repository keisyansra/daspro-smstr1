import java.util.Scanner;
public class Percobaan614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,l,t,L,Vol;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = sc.nextInt();
        L = p*l;
        System.out.println("Luas Persegi Panjang adalah " + L);
        Vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + Vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume = hitungLuas(a,b)*tinggi;
        return Volume;
    }
}