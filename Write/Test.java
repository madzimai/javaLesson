package Write;
import java.lang.Integer;
public class Test {
    private int myValue = 0;

    public void showOne(int myValue){
        myValue = myValue;
    }

    public void showTwo(int myValue){
        this.myValue = myValue;
    }

    public static void main(String[] args) {

        Test ct = new Test();
        ct.showOne(200);
        System.out.println(ct.myValue);
        ct.showTwo(100);
        System.out.println(ct.myValue);

        StringBuilder sb = new StringBuilder("12345678");
       sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb);
    }

}
