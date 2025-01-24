import java.util.ArrayList;

public class Offline {
    public Offline() {
        System.out.println("Offline Constructor");
    }
    public static void main(String[] args) {
        Offline offline = new Offline();
//        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("good");
        list.add("bad");
        list.add("goodone");
        list.add("badone");
        list.remove("good");
//        list.get(4);




        for (String s : list) {
            System.out.println(s);
        }
    }
}