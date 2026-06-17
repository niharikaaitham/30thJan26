package variableStudy;

public class Theory {
    int a = 1;  //instance variable
    static int b = 2;
    ; //static variable

    static void main(String[] args) {
    }

    public void show() {
        /*
        If there is a local variable with same name, we need to call instance variable using this.instanceVariable
        If there is no local variable present with same name, we can call directly.
        If there is a local variable present with same name, we can call static variables using className.staticVariable
        If there is no local variable present with same name, we can call static variables directly in non-static methods.

       */
        int a = 10;
        int b = 20;
        int sum = b + 1;
    }

    public static void show1() {
        /*
        If there is a local variable present with same name, we can call static variables using className.staticVariable
        If there is no local variable present with same name, we can call static variables directly in non-static methods.
        We cannot call non-static instance variables inside a static method directly. We need to create
        an object inside the static method and call the non-static instance variable using the object.
     */
        Theory knowledge = new Theory();
        int b = 20; //local

        int sum1 = Theory.b + 1;
        int sum2 = knowledge.a + 1;

    }
}
