import java.util.Scanner; 

public class Ucapan_14 {
    public static String PenerimaUcaapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcaapan();
        System.out.println("Thank you " + nama + "\n May the force be with you.");
    }
    
}
