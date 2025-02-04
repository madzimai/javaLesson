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
    }

}
