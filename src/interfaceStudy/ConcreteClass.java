package interfaceStudy;

public class ConcreteClass extends ImplementationClass{
    static void main(String[] args) {
        ConcreteClass concreteClass=new ConcreteClass();
        concreteClass.test1();
        concreteClass.test2();
        concreteClass.test3();
        concreteClass.test4();
    }

    @Override
    public void test4() {
        System.out.println("Implementing test4 method from Implementation Class");
    }
}
