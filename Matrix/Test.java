public class Test {

    public static void main(String... args) {
        int[] a = new int[4];
        for (int i = 0; i <= 3; i++) {
            a[i] = i;
        }

        for (int i : a) System.out.println(i);
    }
}
