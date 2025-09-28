public class Day21 {
	public static void main(String[]args ) {
		//sebelum menukar
		String a = "sedih";
		String b = "bahagia";		
		System.out.printf("aku %s, tapi dia %s\n", a, b);		
		//setelah ditukar
		String temp = a;
		a = b;
		b = temp;		
		System.out.printf("aku %s, tapi dia %s\n", a, b);
	}
}
