    package CopilotJava;
    import java.util.*;



    class Baap{
        public int h = 4;
        public int getH(){
            System.out.println("Baap " + h);
            return h;
        }
    }
    public class Beta extends Baap {
        public int h = 44;
        public int getH(){
            System.out.println("Beta " + h);
            return h;
        }
        public static void main(String[] args){
               Beta b = new Beta();
                System.out.println( b.h + " "+ b.getH());
                Beta bb = (Beta) b;
             System.out.println( bb.h + " " +bb.getH());
             //Get class name from an object referece
            List<String> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder("mtrx");
            String s = sb.toString();
            list.add(s);
            System.out.println(s.getClass());
            System.out.println(list.getClass().getName());

        }

    }
