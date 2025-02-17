public class Machine {
    public final static int  LUCKY_NUM =7;
    private int num;
    private  String name;
    public static String description;
    public static int count;
    public int id;

    public Machine() {
        this( 1,"Luky");
        id = count;
                count++;
        System.out.println("First Constructor");
    }
    public Machine(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("Second Constructor");
    }

    public void show(){
        System.out.println("Name: " + name + description +id);
    }

    public static void showInfo(){
        System.out.println(description ) ;
    }

    public static void main(String[] args) {
      Machine.description = "Luky";
      Machine.showInfo();

       Machine m = new Machine();
       m.showInfo();
        m.name="mmm";
        m.show();

        int i = 10;
        do
           while (i++ < 15)
                i = i + 20;
        while (i < 2);
        System.out.println(i);
    }
}
