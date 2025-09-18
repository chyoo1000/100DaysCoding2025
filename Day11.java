import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input username
        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        // input password
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        System.out.println("Akun berhasil dibuat");
        System.out.println("Username: " + username);
        }
    }
}
