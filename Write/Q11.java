package Write;

class A{
    public int i = 10;
    private int J = 20;
}
class B extends A{
    private int i = 20;
    public int k = 40;
}
class C extends B{}

public class Q11 {
    public static void main(String[] args) {
        C c = new C();
       // System.out.println(c.i); compile error
       // System.out.println(c.j);
        System.out.println(c.k);

        System.out.println(((A)c).i);

    }
}
