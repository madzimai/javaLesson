package PackaageTutorial;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Gorilla gorilla = new Gorilla();

        System.out.println(plant.name);
        System.out.println(plant.ID);
        //It wont work -- type is only accessible in plant class scope only.
       // System.out.println(plant.type);



    }
}
