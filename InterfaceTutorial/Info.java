package InterfaceTutorial;

public interface Info {
    public  void printInfo();

    static void m(){
        System.out.println("This is Info");
    }
    default void m2(){
        System.out.println("This is Info m2 ()");
    }


}


