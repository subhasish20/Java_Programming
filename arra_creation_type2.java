public class arra_creation_type2 {
    public static void main(String[] args) {
        
        int[] array;

        array = new  int[5];

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;

        for (int i = 0; i < 5; i++) {
            System.out.printf("the %d element is %d\n", i+1,array[i]);
        }


    }
}
