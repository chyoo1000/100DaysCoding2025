public class Day93 {
	public static void main(String[] args) {
		
		
		//ceil
		//outputnya pembulatan keatas dan sama jika input nya bulat
		System.out.println(Math.ceil(4.1));
		System.out.println(Math.ceil(4.0));
		
		
		//floor
		//outputnya pembulatan kebawah dan sama jika inputnya bulat
		System.out.println(Math.floor(4.1));
		System.out.println(Math.floor(4.0));
		
		//round
		//outputnya, jika >=5 maka pembulatan keatas. jika <5 maka pembulatan kebawah
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(4.4));
		
		//round
		//jika inputan untuk round bertipe float, maka output roundnya menjadi int. jika inputan untuk round bertipe double, maka output roundnya menjadi long
		float a = 4.5f;
		double b = 4.5;
		System.out.println(Math.round(a)); //outpunya menjadi tipe data int
		System.out.println(Math.round(b)); //outputnya menjadi tipa data long
	}
}
