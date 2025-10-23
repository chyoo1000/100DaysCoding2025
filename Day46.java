import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("1. Menu\n");
        System.out.print("Input: ");
        int a = x.nextInt();

        switch (a) {
            case 1:
                System.out.println("\n1. Profile\n2. Balance\n3. Log Out");
                break;
            default:
                System.out.println("Unavailable");
                return;
        }

        System.out.print("Input: ");
        int b = x.nextInt();
        x.nextLine(); // bersihkan buffer

        switch (b) {
            case 1:
                System.out.println("\nName: Cahyo Susanto Basuki");
                System.out.println("NIM: D0225350");
                System.out.println("Study Program: Informatics Engineering");
                System.out.println("Class of: 2025");
                break;
            case 2:
                System.out.println("\nBalance: Rp 107.450.000");
                break;
            case 3:
                System.out.print("\nAre you sure you want to log out? (y/n): ");
                char confirm = x.next().charAt(0);

                if (confirm == 'y' || confirm == 'Y') {
                    System.out.println("\nYou have successfully logged out.");
                } else if (confirm == 'n' || confirm == 'N') {
                    System.out.println("\nLogout canceled. Returning to main menu...");
                } else {
                    System.out.println("\nInvalid choice.");
                }
                break;
            default:
                System.out.println("\nInvalid option.");
        }

        x.close();
    }
}
