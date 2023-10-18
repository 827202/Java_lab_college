public class starpramid {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(n-1));j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
