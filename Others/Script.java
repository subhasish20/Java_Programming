class Script
{
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (++x>10 && ++y<15) {
            x++;
        }
        else{
            System.out.println("x="+x+" y="+y);
        }
    }
}