public class opr {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

//        int c = ++a + b++;
        ++a;
        b++;
        int c = a +b;
        System.out.println("c=" + c);
        System.out.println("b=" + b);
        System.out.println("a=" + a);
    }
}
