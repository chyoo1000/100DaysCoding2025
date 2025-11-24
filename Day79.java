import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("buat akun anda.\nmasukkan username: ");
        String usn = x.nextLine();
        System.out.print("masukkan password: ");
        String pw = x.nextLine();
        System.out.println("akun berhasil dibuat.");
        
        while (true) {
            System.out.print("\nlogin akun anda.\nmasukkan username: ");
            String usnl = x.nextLine();
            System.out.print("masukkan password: ");
            String pwl = x.nextLine();
            
            if(usnl.equals(usn) && pwl.equals(pw)) {
                System.out.println("berhasil login.");
                break;
            } else {
                System.out.print("\ngagal login, silahkan coba lagi.");
            }
        }
    }
    
}
