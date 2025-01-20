package Casting;


public class App {
    public static void main(String[] args) {
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.84f;
        float floatValue2 = (float)99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(floatValue2+ "floatValue2");

        System.out.println(doubleValue+  "doubleValue");
        System.out.println(intValue +  " intValue");
        System.out.println(longValue + " longValue");
        System.out.println(floatValue + " floatValue");

        //The following won't work as we expect it  to!!
        //128 is too big for byte.

        byteValue = (byte)128;
        System.out.println(byteValue);

    }


}
