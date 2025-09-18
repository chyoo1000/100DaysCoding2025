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

        // input konfirmasi password
        System.out.print("Konfirmasi password: ");
        String konfirmasi = input.nextLine();

        // cek apakah password cocok
        if (password.equals(konfirmasi)) {
            System.out.println("Akun berhasil dibuat");
            System.out.println("Username: " + username);
        }
        else {
            System.out.println("Password tidak cocok");
        }
    }
}
