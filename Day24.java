import java.util.Scanner;
public class Day24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("masukkan jari jari lingkaran: ");
		double jari = input.nextDouble();
		
		//rumus luas lingkaran
		double hasil = Math.PI * jari * jari;
		
		System.out.printf("π × %.2f × %.2f = %.2f\n", jari, jari, hasil);
		System.out.printf("maka luas lingkaran adalah %.2f\n", hasil);
	}
}
