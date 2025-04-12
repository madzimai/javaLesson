package TutorialPrac;

public class Person {


    private String name;
    private int age;
    private static int num = 4;

    public static int  numberOfPersons() {
        return num;

    }

    public String helloPerson(String marcus){
         return "Hello "+ marcus;
     }
     public String helloPerson2(){
         return "Hello World";
     }
}
