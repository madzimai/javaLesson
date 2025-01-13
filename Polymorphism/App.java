package Polymorphism;

public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        //Mac is a subclass of laptop
        Mac mac = new Mac();

        // Polymorphism guarantees that we can use a child class
        // wherever a parent class is expected.
        Laptop laptop2 = mac;

        //Laptop2 refrences Mac so display is called
         laptop.display();

         //Another polymorphism example

        doBuy(mac);


    }
    public static void doBuy(Laptop laptop) {
        laptop.display();
    }
}
