import java.util.Scanner;
public class Tugas2 {

    static int jumlahMahasiswa;
    static int jumlahMinggu;
    static int nilaiTertinggi = 0;
    static int mingguNilaiTertinggi = 0;

    private static int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

    public static void main(String[] args) {
        inputJumlahTugasMhs();
        jumlahNilaiMahasiswa();
        tampilNilaiMahasiswa();
        NilaiTertinggi();
        tampilMahasiswaNilaiTertinggi();
    }
    private static void inputJumlahTugasMhs(){
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa=input.nextInt();
        System.out.println("Masukkan jumlah tugas per minggu: ");
        jumlahMinggu=input.nextInt();
        nilaiMahasiswa= new int [jumlahMahasiswa][jumlahMinggu];
    }

    private static void jumlahNilaiMahasiswa() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }
    }

    private static void tampilNilaiMahasiswa() {
        System.out.println("Nilai Tugas Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void NilaiTertinggi() {
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }
        System.out.println("Nilai tertinggi adalah " + nilaiTertinggi + " pada minggu ke-" + mingguNilaiTertinggi);
    }

    private static void tampilMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        int mahasiswaDenganNilaiTertinggi = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaDenganNilaiTertinggi = i;
                }
            }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-" + (mahasiswaDenganNilaiTertinggi + 1) + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + mingguNilaiTertinggi);
    }
}