package Polymorphism;

public class Mac extends Laptop {
    static int[] x = new int[0];
    static{
        x[0] = 10;
    }
    @Override
    public void display() {
        System.out.println("Mac Laptop");
    }

    public void keyboard() {
        System.out.println("Keyboard of Mac Laptop");
    }

}
