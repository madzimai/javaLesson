package InterfaceTutorial;

public class Run {
    public static void main(String[] args) {
// first way to use interface method to all class that implement the interface class
        Info info1 = new Dog();
        info1.printInfo();
        Info.m();
        info1.m2();

        String mom ="nnnnn";
        mom.intern();

         Info info2 = new Machine("Drone");
         info2.printInfo();
// Second way to use interface method to all class that implement the interface class
         outputInfo(info1);
         outputInfo(info2);
    }
private static void outputInfo(Info info){
        info.printInfo();
}
}
