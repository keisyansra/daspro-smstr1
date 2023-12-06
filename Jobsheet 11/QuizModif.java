import java.util.Random;
import java.util.Scanner;

public class QuizModif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();

                if (answer < number) {
                    System.out.println("Tebakan terlalu kecil. Coba lagi!");
                } else if (answer > number) {
                    System.out.println("Tebakan terlalu besar. Coba lagi!");
                } else {
                    success = true;
                    System.out.println("Selamat! Anda benar!");
                }
            } while (!success);

            System.out.println("Apakah anda ingin mengulang permainan (Y/y untuk ya, N/n untuk tidak)?");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        sc.close();
    }
}
