package dataTypes;

public class StaticMethod {
    static void main(String[] args) {
        test1(); //static method calling from same class


        StaticMethod staticMethod = new StaticMethod(); //create object for same class, non-static
        staticMethod.nonStatic(); //non-static method calling with object from same class

        NonStaticMethod nonStaticMethod = new NonStaticMethod(); //create object from another class, non-static
        NonStaticMethod.testStatic(); //non-static from another class
        nonStaticMethod.test2(); //static from another class


    }

    public static void test1() {
        System.out.println("To call Static from same class");
    }

    public void nonStatic() {
        System.out.println("Calling Non-static from same class");
    }


}

