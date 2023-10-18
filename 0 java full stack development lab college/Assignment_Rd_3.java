import java.util.Scanner;

public class Assignment_Rd_3 {


    static void findtypeOfDay(String dayName){

        switch (dayName)
        {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            {
                System.out.println("This day is weekday :");
                break;
            }
            case "saturday":
            case "sunday":
            {
                System.out.println("this is weekend day :");
                break;
            }
            default:
            {
                System.out.println(" not a enter  valid day name : ");
            }

        }
    }
    static  void traffic_light(String color){

        switch (color){
            case "red" : System.out.println("Stop");
            case "green": System.out.println("Go");
            case "yellow":System.out.println("Wait");
            default : System.out.println("wrong input:");
        }
    }



    static void season(String month ){

        switch (month){

            case "january" :
            case"december":
            {
                System.out.println("season is winter : ");
                break;
            }
            case "february":
            case "march":
            {
                System.out.println("Season is spring : ");
                break;
            }
            case "april":
            case "may":
            case "june":
            {
                System.out.println("season is summer");
                break;
            }
            case "july":
            case "august":
            case "september":
            {
                System.out.println("season is mansoon");
                break;
            }

            default:{
                System.out.println("Not a valid month name : ");
            }
        }

    }

    static  void  calculator( char ch ,int a,int b){

        switch (ch)
        {
            case '+':
            {
                System.out.println(a+b);
                break;
            }
            case '-':
            {
                System.out.println(a-b);
                break;
            }
            case '/':
            {
                System.out.println(a/b);
                break;
            }
            case '%':
            {
                System.out.println(a%b);
                break;
            }
            case '*':
            {
                System.out.println(a*b);
                break;
            }
            default: {
                System.out.println("wrong input  charactor :");
            }
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter character : ");
//        char ch = input.next().charAt(0);
//        System.out.println("Enter a Number : ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        calculator(ch,a,b);

//        System.out.println("Enter a month name :");
//        String month = input.nextLine();
//        season(month);

//        System.out.println("Enter a valid color name :");
//        String color = input.nextLine();
//        traffic_light(color);

//        System.out.println("Enter a  choice  key : ");
//        String choice = input.nextLine();

//        System.out.println("enter a day name :");
//        String dayname = input.nextLine();
//        findtypeOfDay(dayname);





    }
}
