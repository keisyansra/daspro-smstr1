import java.util.Random;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebaak angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);
            } while(!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/y untuk ya, 'n' untuk keluar)?");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        sc.close();
    }
    
}
