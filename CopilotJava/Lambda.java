package CopilotJava;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Lambda {
    
    public static void main(String[] args) {

        boolean b1  = checkList(new ArrayList<>(),al ->al.isEmpty());
        boolean b2 = checkList(new ArrayList(), al ->al.add("hello"));
        boolean b3 = checkList(new ArrayList(), al -> {return al.size() == 0;});

        System.out.println("results: " +b1 );
        System.out.println("results: "+ b1 );
        System.out.println("results: " +b3);

    }
    public static boolean checkList(List  list , Predicate<List> p) {
        return p.test(list);
    }
}

