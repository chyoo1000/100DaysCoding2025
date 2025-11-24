public class Day78 {
    public static void main(String[] args) {
        String teks = "  saya cahyo  ";
        System.out.println("length(): " + teks.length());
        System.out.println("toUpperCase(): " + teks.toUpperCase());
        System.out.println("toLowerCase(): " + teks.toLowerCase());
        System.out.println("equals(\"saya cahyo\"): " + teks.equals("saya cahyo"));
        System.out.println("equalsIgnoreCase(\"  saya cahyo  \"): " + teks.equalsIgnoreCase("  saya cahyo  "));
        System.out.println("contains(\"cahyo\"): " + teks.contains("cahyo"));
        System.out.println("isEmpty(): " + teks.isEmpty());
        System.out.println("substring(2, 6): " + teks.substring(2, 6));
        System.out.println("replace(\"cahyo\", \"siapa?\"): " + teks.replace("cahyo", "siapa?"));
        System.out.println("trim(): " + teks.trim());
    }
}
