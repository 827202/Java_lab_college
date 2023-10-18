import java.util.*;
public class number_sum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
       while(number>0){
            int digit=number%10;
            sum+=digit;
            number=number/10;
          
           
        }
        System.out.println("Your sum of digit is: " +sum);
     

    }
    
}
