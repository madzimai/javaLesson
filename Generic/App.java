package Generic;
import java.util.ArrayList;
import java.util.HashMap;

class Animal{
    String name;
    public String toStirng(){
     return " Many Animals";

    }
    public void eat(){
        System.out.println("Eating animal");
    }

}
class Cat extends Animal{

    @Override
    public String toStirng(){
        return "Cat is nice";
    }
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

/****************************************************************/
  ArrayList<Cat> mamalCats = new ArrayList<Cat>();
  mamals.add(new Cat());
  mamals.add(new Animal());

  ArrayList<Animal> listAnimals = new ArrayList<Animal>();
  listAnimals.add(new Animal());
  listAnimals.add(new Cat());

  printAnimals(listAnimals);
  //show list accesses both annimal and cats
  showList(mamalCats);
  showList(listAnimals);

    }

    public static void printAnimals(ArrayList<Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal.toStirng());
        }
    }
//use wildcard on unknown parameter type
    public static void showList(ArrayList<?>list){

        for(Object  value : list){
            System.out.println(value);
        }
    }
    //Accessing class and its sub class with this method
    public static void showList1( ArrayList<? extends Animal> animals){
        for(Animal  value : animals){
            //down cast
            System.out.println(value.toStirng());
            System.out.println(value);
            value.eat();


        }
    }
    //Accessing  class and its super class with this method
    public static void showList2( ArrayList<? super Cat> animals){
        for(Object  value : animals){
            System.out.println(value);
        }
    }

}
