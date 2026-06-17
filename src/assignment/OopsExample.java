package assignment;

public class OopsExample {
    String colour;

    public static void main(String[] args) {
        OopsExample oopsExample = new OopsExample();      // object 1
        oopsExample.colour = "Red";
        oopsExample.main();

        OopsExample oopsExample1 = new OopsExample();      // object 2
        oopsExample1.colour = "Blue";
        oopsExample1.main();
    }

    public void main() {     // method
        System.out.println("Colour is " + colour);
    }
}
