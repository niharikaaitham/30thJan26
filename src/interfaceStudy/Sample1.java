package interfaceStudy;

public interface Sample1 {
    void test1();
    void test2();

     default void show(){
        System.out.println("Default method from interface1");

   }
    static void show1(){
        System.out.println("static method from interface1");

    }
}
