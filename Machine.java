public class Machine {
    private int num;
    private  String name;

    public Machine() {
        this( 1,"Luky");
        System.out.println("First Constructor");
    }
    public Machine(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("Second Constructor");
    }

    public static void main(String[] args) {
        Machine m = new Machine();
    }
}
