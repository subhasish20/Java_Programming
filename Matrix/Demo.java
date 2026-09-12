public class Demo {

    public static void main(String[] args) {
        int[][] x = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
        for (int[] i : x) for (int val : i) System.out.println(val);
    }
}
