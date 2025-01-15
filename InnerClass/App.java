package InnerClass;

import javax.management.monitor.Monitor;

public class App {
        public static void main(String[] args) {
            // accessing public static class
            Machine.Battery battery = new Machine.Battery();
            battery.charge();

            Machine machine = new Machine(2);
            machine.start();
            //Access a public/protected inner class
             Machine.Monitor monitor = machine.new Monitor();
             monitor.think();


        }
    }
