import java.util.Scanner;

public class Area {
    static Scanner cs = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the height and width of the triangle :");
        int a = cs.nextInt();
        int b = cs.nextInt();
        int c;
        c = a * b * 1 / 2;

        System.out.println(c);
    }
}
