import java.util.Scanner;

class arithmetic_operator{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int var1,var2,add,sub,mul,modulo;
        float div;

        System.out.println("Enter the first number :");
        var1 = input.nextInt();
        System.out.println("Enter the second number :");
        var2 = input.nextInt();

        add = var1 + var2 ;
        sub = var1 - var2;
        mul = var1 * var2;
        div = (float) var1 / var2;
        modulo = var1 % var2;

        System.out.printf("the sum of the two number is :%d\n",add);
        System.out.printf("the difference between two number is %d\n",sub);
        System.out.printf("the division of given number is :%f\n",div);
        System.out.printf("the multiplication of two number is :%d\n",mul);
        System.out.printf("the module of the two number is %d\n",modulo);


        input.close();
    }
}