package constructorStudy;

public class A { //default constructor
    static void main(String[] args) {
A a=new A();
A a1=new A(1);

    }
    private A(){
        System.out.println("zero parameter");
    }
    public A(int a){
        System.out.println("With parameters");

    }
}
