package interfaceStudy;

public interface Sample2{

    void test3();
void test4();

     default void show(){
        System.out.println("Default method from interface2");
     }

    static void show1(){
        System.out.println("static method from interface1");

    }
}



