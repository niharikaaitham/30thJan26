package casting;

public class ClassCastingStudy {
    static void main(String[] args) {
        Father father=new Father();
        father.bike();
        father.car();
        father.height();
        Son son=new Son();
        son.bike();
        son.car();
        son.height();
        son.hair();

        Father son1=new Son();
//        parentclass refvar=new childclass();

        son1.height();
        son1.bike();
        son1.car();

    }
}
