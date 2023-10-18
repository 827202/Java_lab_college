import java.util.*;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numner what you want");
        int n=sc.nextInt();
        
        do{
          int ans= n%10;
          
          System.out.print(ans + "");
          n=n/10;

        }while(n>0);
    }
    
}
