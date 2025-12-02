public class Day86 {
    public static void main(String[] args) {
    int[] angka = {5, 2, 9, 1, 7};
        int min = angka[0];
        for(int i = 1; i < angka.length; i++){
            if(angka[i] < min){
                min = angka[i];
            }
        }
        System.out.println("angka minimal: "+ min);
}
}
