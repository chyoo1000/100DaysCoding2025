import java.util.Scanner;
public class Day39 {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.println("1. GoPay: •••••0670");
		System.out.println("2. ShopeePay: •••••1821");
		System.out.println("3. Alfamart (Di Kasir)");
		System.out.println("4. DANA: 62-812****0670");
		System.out.println("5. Telkomsel");
		System.out.println("6. Google Play balance: IDR 0.00");
		System.out.print("Pilih metode pembayaran: ");
		byte byr = z.nextByte();
		if (byr == 1){
			System.out.println("\nPembayaran sukses");
		}else if (byr ==2){
			System.out.println("\nPembayaran sukses");
		}else if (byr ==3){
			System.out.println("\nPembayaran sukses");
		}else if (byr ==4){
			System.out.println("\nSilahkan menghadap ke Kasir");
		}else if (byr ==5){
			System.out.println("\nPembayaran sukses");
		}else if (byr ==6){
			System.out.println("\nIsi terlebih dahulu");
		}else{
			System.out.println("\nPembayaran tidak valid");
		}
	}
}
