package abstractClass;

public class C extends B{
    static void main(String[] args) {
C c=new C();
c.show1();c.show2();c.show3();c.show4();
c.show7();c.show5();
    }
    @Override
    public void show5() {
        System.out.println("Implemented from B class");
    }

    public void show7(){
        System.out.println("Implemented from C class");
    }
}
