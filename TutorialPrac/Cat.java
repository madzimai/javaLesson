package TutorialPrac;

 interface  Walk {
    public default int getSpeed(){
        return 5;
    }
 }
  interface Speed {
    public default int getSpeed(){
        return 10;
    }

 }

public class Cat implements Walk, Speed {
    public int getSpeed(){
        return 6;
    }
    public static void main( String [] args){
        System.out.println(new Cat().getSpeed());
    }
    
}
