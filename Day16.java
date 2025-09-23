import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
		//perkalian
		System.out.println("Perkalian (×)"); {
		System.out.print("Masukkan Angka Pertama: ");
		float a1 = input.nextFloat();
		System.out.print("Masukkan Angka Kedua: ");
		float a2 = input.nextFloat();
		float hasilA = a1 * a2;
		System.out.printf("%.2f × %.2f = %.2f", a1, a2, hasilA);
		}
		//pembagian
		System.out.println("\n\nPembagian (÷)"); {
		System.out.print("Masukkan Angka Pertama: ");
		float a1 = input.nextFloat();
		System.out.print("Masukkan Angka Kedua: ");
		float a2 = input.nextFloat();
		float hasilA = a1 / a2;
		System.out.printf("%.2f ÷ %.2f = %.2f", a1, a2, hasilA);
		}
	}
}
