public class Day76 {
    public static void main(String[] args) {
        String a = "Halo";
        String b = "halo";
        String c = "";
        String d = "contoh kalimat";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(d.contains("contoh"));
        System.out.println(c.isEmpty());
    }
}
