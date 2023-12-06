import java.util.Scanner;

public class BioskopWithScanner14Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = 4;
        int kolom = 2;
        String nama;
        String next;
        
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            int menu = sc.nextInt();
            sc.nextLine(); // Membersihkan newline setelah membaca integer

            switch (menu) {
                case 1: // Input data penonton
                    System.out.print("Masukkan nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine(); // Membersihkan newline setelah membaca integer
                    
                    penonton[baris-1][kolom-1] = nama;
                    break;

                case 2: // Tampilkan daftar penonton
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                    break;

                case 3: // Exit
                    System.out.println("Terima kasih! Program dihentikan.");
                    sc.close();
                    System.exit(0);
            }
        }
    } 
}
