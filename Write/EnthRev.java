package Write;

public class EnthRev {
    public static void main(String[] args) {
        String blank  = " ";  // one space
        String line = blank + "hello" + blank + blank;
        line.concat("world");
        String newLine  =  line.trim();
        System.out.println((int)(line.length() + newLine.length()));
    }
}
