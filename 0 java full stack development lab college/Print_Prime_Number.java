import java.util.Scanner;

public class Print_Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a range : ");
        int n = in.nextInt();
        for (int i = 2; i <= n ; i++) {
            int j = 2;
              while (j<i){
                  if (i % j == 0){
                      break;
                  }else {
                      System.out.println( i + " ");

                  }
                  j++;
              }

            }
    }
}
