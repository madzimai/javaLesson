package Prac-03-02;


class XXX{
    public void m1() throws Exception{
        throw new Exception();
    }
}

class YYY extends XXX {
    public void m1(){

    }
}

public class Prac {
    public static void main(String[] args) {
        YYY yyy = new YYY();// it works
        YYY yyy1 = (YYY) new XXX(); // it works when we cast like this.

        XXX xxx = new YYY(); // unhandled exception
        XXX xxx2 = new XXX(); // it won't work bcz the exception thown in XXX class is not handled in main method

        yyy.m1();
        xxx2.m1();
        yyy1.m1();
        xxx.m1();



    }
}