import java.util.Scanner;

public class Main {
    static void swap(int a,int b){
         a= a+b;
         b=a-b;
         a = a-b;

        System.out.println(a);
        System.out.println(b);
    }

    static void greaterNumber(int a,int b,int c){

        // max = (a>b) ? ( a>c ? a:c) : (b>c ? b : c)  //  used ternary operator

        int max = (a>b)? (a>c ? a : c) : (b>c ? b : c);

        System.out.println("Greater number is : " + max);
    }

    static void circle(int r){
        double area = 3.14*r*r;
        System.out.println("Area of circle : " + area);
    }

    static void triangleArea(int h,int b){
        int AreaTriangle = (h * b)/2;
        System.out.println("Area of Triangle : " + AreaTriangle);
    }

    static  void Odd_OR_Even_Number(int n){

        String  msg  = (n % 2 == 0) ? "this number is even " : "this number is odd";
        System.out.println(msg);
       
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

       //  System.out.println("Enter the edges of triangle : ");

        int n = input.nextInt();

//        int h = input.nextInt();
//        int b= input.nextInt();

//        System.out.println("enter a radius of circle : ");
//        int r= input.nextInt();

//        System.out.println("enter value of a , b  and c : ");
//        int b = input.nextInt();
//        int a = input.nextInt();
//        int c = input.nextInt();

//        System.out.println("before swap a : "  + a );
//        System.out.println("before swap b : "  + b );
//        System.out.println("After swap : ");
//        swap(a,b);

       // circle(r);

       // triangleArea(h,b);

        Odd_OR_Even_Number(n);

       // greaterNumber(a,b,c);


    }
}