package InterfaceTutorial;

public class Machine implements Info{
    private String name;


    public void start(){
        System.out.println("Machine Start");
    }

    public Machine(String name){
        this.name = name;
    }
 @Override
    public void printInfo() {
        System.out.println("Machine Info  " + name);

    }
}
