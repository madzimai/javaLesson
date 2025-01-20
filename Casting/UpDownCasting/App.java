    package Casting.UpDownCasting;

    class Machine {
        public void start(){
            System.out.println("Machine started");
        }
    }

    class Camera extends Machine {
        public void start(){
            System.out.println("Camera started");
        }
        public void snap(){
            System.out.println("Photo taken");
        }
    }

    public class App {

        public static void main(String[] args) {
            Machine m = new Machine();
            Camera c = new Camera();

            m.start();
            c.start();
            c.snap();

            //Upcasting
            Machine m2 = new Machine();
            m2.start();
            //error: machine2.snap();

            //Downcasting
            Machine m3 = new Camera();
            Camera c2 = new Camera();
            m3.start();

            //Doesn't work --- runtime error.
            Machine m4 = new Camera();

            // Camera camera3 = (Camera)machine4;
            // camera3.start();
            // camera3.snap();
        }
    }
