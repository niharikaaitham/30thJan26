package dataTypes;

public class ParameterStudy {
    static void main(String[] args) {
        ParameterStudy parameterStudy=new ParameterStudy(); //define object for non-static method and call method using object
        display(12,23); //add just method(); for static void method
        parameterStudy.display(2,"niharika");
        parameterStudy.display("niharika",2);

    }
    public static void display(int a, int b){
        System.out.println(a);
        System.out.println(b);

    }
    public void display(String name, int b) {
        System.out.println(name);
        System.out.println(b);
    }

    public void display(int a, String name) {
        System.out.println(name);
        System.out.println(a);
    }

}
