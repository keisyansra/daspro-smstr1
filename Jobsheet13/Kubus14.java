import java.util.Scanner;
public class Kubus14 {
    static int hitungVolume(int s) {
        int volume = s*s*s;
        return volume;
    }
    static int hitungLuasPermukaan(int s) {
        int volume = hitungVolume(s);
        int luas = volume * 6;
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, l, v;
        System.out.println("Masukkan panjang sisi kubus : ");

        sisi = sc.nextInt();
        v = hitungVolume(sisi);
        System.out.println("Volume kubus : " + v);

        l = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus : " + l);
    }
}