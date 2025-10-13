import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai angka (0-100): ");
        int nilai = in.nextInt();

        if (nilai >= 60) {
            if (nilai >= 80) {
                System.out.println("nilai kamu A");
            } else {
                System.out.println("nilai kamu B");
            }
        } else {
            System.out.println("kamu tidak lulus");
        }
    }
}
