import java.util.*;
public class prime_givenRange {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("number1");
        int num1=sc.nextInt();
        System.out.println("number 2");
        int num2=sc.nextInt();

        for(int i = num1; i <= num2/2; ++i){
          if(num2%i==0){
            flag =true;
           break;
        }
      }
      if(!flag){
        System.out.println("your prime number "+num1+ " and " +num2+ " are ");
      }else{
        System.out.println("not prime number");
      }

    }
    
}
