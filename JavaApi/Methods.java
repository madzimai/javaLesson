package JavaApi;

import java.util.Arrays;

public class Methods {
    String name;
    public static void main(String[] args) {
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z));//equals to check the values inside the String
        System.out.println(x==z); //this check the object reference. 🙌

        Methods t1 = new Methods();
        Methods t2 = new Methods();
        Methods t3 = t1;
        System.out.println(t1 == t1);// true because we are comparing same ref
        System.out.println(t1.equals(t2));// the class does not implement equals()
        System.out.println(t1 == t2);// false because the ref are different
        String[] strings = { "81", "9", "100" };
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
