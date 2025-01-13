package Generic;
class Machine {
    public void start(){
        System.out.println("Machine is running");
    }
}
interface Person {
    public void eat();
}
public class Anonymous {
    public static void main(String[] args) {
        Machine machine = new Machine(){
            @Override
            public void start() {
                System.out.println("Machine is running");
            }

        };
        machine.start();

        Person person = new Person(){
            public void eat() {
                System.out.println("Person is eating");
            }

        };
        person.eat();

    }


}
