package PackaageTutorial;

public class Oak extends Plant {

    public Oak() {
        // it wont work ---typr is private.
       // type = "tree";

        /* This works --- size is protected , Oak is a subclass of Plant, the y are also in same package*/
        this.size ="large";
    }
}
