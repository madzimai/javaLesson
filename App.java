class Person{
    String name;
    int age;
    void speak(){
        System.out.println("My name is" + name + "and I am " + age + " years old");
    }
    void hello(){
        System.out.println("Hello there!");
    }
}




public class App {
    public static void main (String[] args){
        Person p1 = new Person();
        p1.name = "Netsai";
        p1.age = 18;
        p1.speak();
        p1.hello();

        System.out.println(p1.name);

        Person p2 = new Person();
        p2.name = "Naum";
        p2.age = 48;
        p2.speak();

        System.out.println(p2.name);
    }
}
