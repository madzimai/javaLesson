package JavaApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


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

        int[][] twoD = new int[3][2];
        for(int i=0; i<twoD.length;i++){
            for(int j=0; j<twoD[i].length;j++){
                System.out.println(twoD[i][j]);
                System.out.println("////");
            }
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println("numbers: " +numbers);

    }
}
