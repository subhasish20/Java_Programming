import java.util.Scanner;

class test
{
    static Scanner S  = new Scanner(System.in);
    public static void main(String[] args )

   {
    int choice;
    System.out.println("press 1 for addition : \t\t press 2 for substraction : \n press 3 for multiplication  : \t\t press 4 for division :");
    choice = S.nextInt();
     
     int a, b;
     System.out.println("enter two number for your operation :");
     a  = S.nextInt();
     b = S.nextInt();

   switch(choice)
       {
        case 1 : System.out.println("the addition of two number is "+a+b);
        break;
        case 2 : System.out.println("the addition of two number is "+(a+b));
        break;        
        case 3 : System.out.println("the addition of two number is "+(a+b));
        break;        
        case 4 : System.out.println("the addition of two number is "+(a+b));
        break;
       default:  System.out.println("invalid number try again later ");
       }

    }
} 
    

