package assignment;

public class ParameterReturn {
    static void main(String[] args) {
        ParameterReturn parameterReturn = new ParameterReturn();
        parameterReturn.display(1, 2);
        displayStatic("Niha",30);
    }

    public void display(int a, int b) {
        System.out.println(a);
        System.out.println(b);

    }
    public static void displayStatic(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}

