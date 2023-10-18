public class Revrse_Tringle_Pattern {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
