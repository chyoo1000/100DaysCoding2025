import java.util.Scanner;
public class Day22 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("masukkan panjang sisi persegi: ");
int sisi = input.nextInt();
int luas = sisi * sisi;
System.out.printf("%d × %d = %d\nmaka luas persegi adalah %d\n", sisi, sisi, luas, luas);
	}
}
