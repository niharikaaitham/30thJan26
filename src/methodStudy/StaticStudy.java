package methodStudy;

public class StaticStudy {
    //Calling a static method within the same class.
    static void main(String[] args) {
        StaticStudy staticStudy=new StaticStudy();
        test();
        staticStudy.test1();
        AnotherClass.test3();
        AnotherClass anotherClass=new AnotherClass();
anotherClass.test4();
    }
    public static void test(){
        System.out.println("Calling static from same class");
    }
    public void test1(){
        System.out.println("Calling non-static from same class");
    }
}
