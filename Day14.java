public class Day14 {
    public static void main(String[] args) {
        
        String strInt = "100";
        String strDouble = "75.5";
        String strBoolean = "true";
        String strChar = "A";
        
        int BInt = Integer.parseInt(strInt);
        double BDouble = Double.parseDouble(strDouble);
        boolean status = Boolean.parseBoolean(strBoolean);
        char huruf = strChar.charAt(0);
        
        System.out.println(BInt);
        System.out.println(BDouble);
        System.out.println(status);
        System.out.println(huruf);
    }
}
