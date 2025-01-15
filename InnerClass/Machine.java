package InnerClass;

public class Machine {
    private int id;
    protected class Monitor{
        public void think(){
            System.out.println("Monitor is thinking...");
        }
    }
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }
    public Machine(int id) {
        this.id = id;
    }
    public void start(){
        Monitor monitor = new Monitor();

        monitor.think();
    final String name = "Local Machine";
        class Temp{
            public void take(){
                System.out.println("ID is: " + id);
                System.out.println("Temp is on. " + name );
            }

        }
        Temp temp = new Temp();
        temp.take();

    }
}
