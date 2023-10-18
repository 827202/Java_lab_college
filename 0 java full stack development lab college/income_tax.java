import java.util.Scanner;

public class income_tax {

    static void calculate_TAX(int salary){

        int k = 1000;
        int IncomeTAX = 0;
        if (salary <= 10*k){
            IncomeTAX = salary * 0;
            System.out.println("IncomeTAX is : " + IncomeTAX);
        } else if (salary <= 20*k ){
            IncomeTAX = (salary*10)/100;
            System.out.println("IncomeTAX is : " + IncomeTAX);
        } else if (salary <= 30*k){
            IncomeTAX = (salary*15)/100;
            System.out.println("IncomeTAX is : " + IncomeTAX);
        } else if (salary>30*k){
            IncomeTAX = (salary*25)/100;
            System.out.println("IncomeTAX is : " + IncomeTAX);
        }

    }
}

//     static void printDaysName(int n){


//         if (n == 1){
//             System.out.println("Monday");
//         } else if (n == 2){
//             System.out.println("Tuesday");
//         } else if (n == 3) {
//             System.out.println("Wednesday");
//         } else if (n == 4) {
//             System.out.println("Thursday");

//         } else if (n == 5) {
//             System.out.println("Friday");
//         } else if (n == 6) {
//             System.out.println("Saturday");
//         }else {
//             System.out.println("Sunday");
//         }


//     }

//     static void convertTemparature(int f){
// //
// //        float f = (float)1.8*c+32;
// //        System.out.println("Fahrenheit Temparature is : " + f);

//           float celsius = (float)(f*5)/9 - (32*5)/9;
//         System.out.println("celsius temparature is : " + celsius);

//         float kalvinTemp = celsius + 273;
//         System.out.println("Kalvin temparature is : " + kalvinTemp);

//     }


//     static void find_Vowel_Consonant(char ch){
//         if (ch == 'A' || ch == 'I' || ch == 'O' || ch == 'E'|| ch == 'U') {
//             System.out.println("Vowel: ");

//         } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
//             System.out.println("vowel: ");
//         }else {
//             System.out.println("consonant : ");
//         }

//     }

//     static void leapYear(int n){
//       if(n%4==0) {

//           if (  n % 400 !=n && n % 100 == 0) {

//               System.out.println(" not leap year");
//           }
//           else{
//               System.out.println(" leap year");
//           }
//       }
//       else{
//           System.out.println("not leap year");
//       }

//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

// //        System.out.println("Enter salary : ");
// //        int salary = input.nextInt();

//        // System.out.println("Enter a  Temparature : ");

//         // int n = input.nextInt();
//           System.out.println("Enter a Year: ");
//           int n= input.nextInt();
//        // System.out.println("Enter a character : ");
//         // char ch = input.next().charAt(0);
//        // find_Vowel_Consonant(ch);
//         //leapYear(n);

//       //  convertTemparature(c);

//         // printDaysName(n);
//        // calculate_TAX(salary);



//     }
// }
