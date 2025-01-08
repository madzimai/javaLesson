class Person{
    String name;
    int age;
}




public class App {
    public static void main (String[] args){
        Person p1 = new Person();
        p1.name = "Netsai";
        p1.age = 18;
        System.out.println(p1.name);

        Person p2 = new Person();
        p2.name = "Naum";
        p2.age = 48;
        System.out.println(p2.name);
    }
}
