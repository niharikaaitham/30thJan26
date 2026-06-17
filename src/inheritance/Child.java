package inheritance;

public class Child extends Parent {
    String hair = "Wavy"; //global
    static String name = "Niha";

    public static void main(String[] args) {
        System.out.println("Parent's properties: ");
        System.out.println("---------------------------");

        Parent parent = new Parent(); // object for parent class
        parent.nature(); //parent class properties
        Parent.height();
        System.out.println("Child acquiring parent's properties: ");
        System.out.println("---------------------------");

        Child child = new Child(); //object for child's class
        child.nature(); //child class properties acquired from parent's class
        Child.height(); //child class properties acquired from parent's class
        System.out.println("Child's properties: ");
        System.out.println("---------------------------");
        child.weight(); //child properties
        colour(); //child properties
        System.out.println("---------------------------");
        System.out.println(child.hair);
        System.out.println(child.bloodGroup);
        System.out.println(name);
    }

    public void weight() {
        System.out.println("Child's Weight");
    }

    public static void colour() {
        System.out.println("Child's Colour");
    }
}

