package InterfaceTutorial;

public class Dog implements Info{
    String name;
    private int age = 7;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog( ) {


    }

    public void printInfo() {
   System.out.println("It age " + age);
    }
}
