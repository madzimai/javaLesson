package OfflinePrac;

abstract class Food{
    public abstract  String flavour();

}
interface InnerCook {
    void  feed();

    static String took = "waal";
    default int tk(){
        return 4;
    }
 static void burn(){
    System.out.println("It's burning ....");
 }
    
}

public class Cook extends Food implements InnerCook{
    public String flavour (){
        return " kutsva";
    }
    public void feed(){
        System.out.println("munandi");
    }
    public static void main(String[] args){
        Cook ck = new Cook();
        // Food fd = (Food)Cook();
                System.out.println(InnerCook.took);
                System.out.println(ck.flavour());
                // System.out.println(fd.flavour());
               
            }
}
