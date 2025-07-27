import java.util.Scanner;

public class Area_Rect {
    public static void main(String[] args){
        int a,b,c;
        Scanner s = new Scanner(System.in);

        System.out.printf("enter the height and width of the rectangle :");
        a = s.nextInt();
        b = s.nextInt();
        c = a*b;
        System.out.printf("Thre area of the rectangle is : %d",c);
        s.close();
    }
}
