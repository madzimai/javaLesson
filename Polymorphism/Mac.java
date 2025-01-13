package Polymorphism;

public class Mac extends Laptop {
    @Override
    public void display() {
        System.out.println("Mac Laptop");
    }

    public void keyboard() {
        System.out.println("Keyboard of Mac Laptop");
    }

}
