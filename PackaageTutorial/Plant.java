package PackaageTutorial;

public class Plant {
    public String name;
    //Acceptable practise--- it's final
   public static final int ID = 8;

   private String type;

   protected String size;

   public Plant(){
       this.name = "Netsai";
       this.type = "plant";
       this.size = "small";
   }
}
