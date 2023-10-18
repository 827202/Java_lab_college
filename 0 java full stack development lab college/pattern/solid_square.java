import java.util.Scanner;

public class solid_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the row:");
        // int row=sc.nextInt();
        int row=5;
        //   System.out.println("enter the column:");
        // int col=sc.nextInt();
        int col=5;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
//    sc.close();
    
}
