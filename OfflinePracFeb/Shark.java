package OfflinePracFeb;
class Fish {
    protected int size;
    private int age;
    public Fish(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public class Shark extends Fish {

        private int numberOfFins = 8;
        public Shark (int age){
            super(age);
            this.size = 4;
        }

        public void displaySharkDetails(){
            System.out.println("Shark with age "+getAge());
            System.out.println("and with "+ super.size+ "meters long");
            System.out.println("with "+ numberOfFins);
        }
    }
}

