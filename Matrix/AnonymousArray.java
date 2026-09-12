public class AnonymousArray {

    public static void main(String[] args) {
        sum(new int[] { 10, 20, 30, 40 });
    }

    public static void sum(int[] x) {
        int total = 0;
        for (int a : x) total += a;

        System.out.println(total);
    }
}
