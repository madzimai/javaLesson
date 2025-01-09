

class Person{
    String name;
    int age;
    String text;
    int height;

    void speak(){
        System.out.println("My name is" + name + "and I am " + age + " years old");
    }
    void hello(){
        System.out.println("Hello there!");
    }

    public  void jump(int height){
        System.out.println("Jumping: "+ height);
    }

    int calculateAgeToRetirement(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }
    int getAge(){
        return age;
    }
}




public class App {
    public static void main (String[] args){
        Person p1 = new Person();
        p1.name = "Netsai";
        p1.age = 18;
        p1.speak();
        p1.hello();
       int age = p1.getAge();

       int years = p1.calculateAgeToRetirement();
        System.out.println(years);
        System.out.println(p1.getAge());
        System.out.println(p1.name);

        Person p2 = new Person();
        p2.name = "Naum";
        p2.age = 48;
        p2.speak();
        p2.jump(25);

        System.out.println(p2.name);
    }
}
