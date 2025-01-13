package PackaageTutorial;

public class Animal {
    private String name;
    public int age;
    public Animal(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Animal( int age) {
        super();
        this.age = age;
        this.name = null;

    }
}
