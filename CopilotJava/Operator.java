package CopilotJava;


public class Operator {
    public static void main(String[] args) {
    short y = (short) 1921222;

    System.out.println(y);
    short x =10;
    short s = 3;
       // short z =  (x*s); this gives ann error because all short value are automatically promoted to int.
    short z = (short) (x*s);
    System.out.println(z);
}}
