import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1 range:");
        int number1=sc.nextInt();
        System.out.print("Enter the number2 range:");
        int number2=sc.nextInt();
    
        System.out.print("your Even numbers " +number1+ " to " +number2+ " are ");

        for(int i=number1;i<=number2;i++){
         
         if(i%2==0)
         System.out.println(i);
        }
    System.out.println("your odd numbers " +number1+ " to " +number2+ " are ");

         for(int i=number1;i<=number2;i++){
  
          if(i%2==1)
          System.out.println(i);
        }
      
    }
    
}
