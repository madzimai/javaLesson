package StaticClasses;

class TopLevel{
    void display( Outer outer){

        System.out.println(outer.outerName);
        System.out.println(Outer.staticOuterField);
    }
}

public class Outer {
    String name = "outer Name or field";
    String outerName = "Outer Name or field";
    static  String staticOuterField = "Static outer field";

    class InnerClass {
        String name = "Inner Name or field";
        void accessOuterField() {

            System.out.println(name);
            System.out.println(outerName);
            System.out.println(staticOuterField);
        }
    }
    static class StaticInnerClass {
        //shadowing
        String name = "Static Inner Name or field";
        void accessMembers( Outer outerClass ) {
            System.out.println(name);
            System.out.println( outerClass.outerName );
            System.out.println( staticOuterField );
            // compile error: Cannot make static reference to the non-static field outerName
            // System.out.println(outerName);
        }
    }
    public static void main(String[] args) {
        System.out.println("Inner class");
        System.out.println("***********");


        Outer outerObject = new Outer();
        Outer.InnerClass inner = outerObject.new InnerClass();
        inner.accessOuterField();


        System.out.println("Static Nested class");
        System.out.println("-------------");
        StaticInnerClass staticInnerObject = new StaticInnerClass();
        staticInnerObject.accessMembers(outerObject);


        System.out.println("Top level class");
        System.out.println("=========");
        TopLevel topLevelObject = new TopLevel();
        topLevelObject.display(outerObject);

    }
}
