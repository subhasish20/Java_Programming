public class parameterised_constructor {
    public parameterised_constructor(int a)
    {
        System.out.println("the value of a is "+a);
    }
    public static void main(String[] args) {
        parameterised_constructor obj = new parameterised_constructor(7);
    }
}
