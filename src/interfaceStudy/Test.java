package interfaceStudy;

public class Test implements Sample2, Sample1{
    @Override
    public void test1() {
        System.out.println("Interface1 test1 method");
    }

    @Override
    public void test2() {
        System.out.println("Interface1 test2 method");

    }

    @Override
    public void test3() {
        System.out.println("Interface2 test3 method");

    }

    @Override
    public void test4() {
        System.out.println("Interface4 test4 method");

    }

    @Override
    public void show() {
        Sample2.super.show();
        Sample1.super.show();

    }

//    @Override
//    public void show1() {
//        Test.show1();
//    }


    static void main(String[] args) {
        Test test=new Test();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.show();
        Sample1.show1();
        Sample2.show1();

    }
}
