package Operators;

public class TestClass{    public static void main(String args[ ] )
{       int i = 0 ;
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool  = false;
        bool = (bool2 &  method1("1"));
    System.out.println(bool+ " 1");
        bool = (bool2 && method1("2"));
        System.out.println(bool+  " 2");
         bool = (bool1 |  method1("3"));
         System.out.println(bool+ " 3");
         bool = (bool1 || method1("4"));
         System.out.println(bool+ " 4");
    }
    public static boolean method1(String str){
    System.out.println(str);
    return true;
} }

// The logic prints 1 & 3 because the bitwise operators allows method call because the evaluate both side even the bool value is false
// 2 & 4 doesn't print anything in the terminal because the logical operators use circuiting and evalutes the left side that may skip method calls.