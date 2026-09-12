import java.util.Scanner;

public class Greatest_3num {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a,b,c;
        
            
            System.err.println("Enter three numbers");
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
        
            if (a>b  && a>c)
            {
                System.out.println("the greatest number is "+a);
            }
            else if(b>c && b>a){
                System.out.println("the greatest number is "+b);
            }
            else
            {
                System.err.println("the greatest number is "+c);
            }
            s.close();
    }
}
