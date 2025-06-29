package OfflinePrac;

public class Room {
    public String name;
    protected int height;

    private float amt;

public Room( String name, int height ){
    this.name = name;
    this.height = height;
 }

 public int getHeight(){
    return height;
 }

 public String getName(){
    return name;
 }

 public int  setHeight(){
    return this.height;
 }
 public String setName(){
    return this.name;
 }
 private static void add(){
 System.out.println("nok" );
  
 }
 
}
class InnerRoom  extends Room {

    private float amt;

    public InnerRoom(){
        super( "err",2);  
    } 

    public String getName(){
        return "When ";
    }
    public String setHeight( float amt){
        return "hook";
    }

    private static void add(){
        System.out.println("milk");
    }
    public int getHeight(){
        return 3;

    }

}