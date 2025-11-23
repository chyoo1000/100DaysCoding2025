public class Day77 {
    public static void main(String[] args) {
        String teks = "  saya cahyo  ";

        String potong = teks.substring(2, 6);
        String ganti = teks.replace("cahyo", "siapa?");
        String rapih = teks.trim();

        System.out.println(potong);
        System.out.println(ganti);
        System.out.println(rapih);
    }
}
