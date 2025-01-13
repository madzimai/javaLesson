package Generic;
import java.util.ArrayList;
import java.util.HashMap;

class Animal{
    String name;
}

public class App {
    public static void main(String[] args) {
        ///////Before Java 5////////
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        String letters = (String)list.get(0);
        System.out.println(letters);

        //////// Morden style/////
        ArrayList<String> List = new ArrayList<String>();
        List.add("Apple");
        List.add("Banana");
        List.add("Cake");
        String letters2 = List.get(1);
        System.out.println(letters2);

        /////There can be more that one  type arguemennt /////
        HashMap<Integer, String > Tools = new HashMap<Integer,String>();
        //////Java Style /////
        ArrayList<Animal> mamals = new ArrayList< Animal>();
    }


}
