package accessSpecifiers;

import variableStudy.X;

public class B extends X {
    static void main(String[] args) {
        A a = new A();
        int sub = 10 - a.b;  //private is not accessible/visible in another class
        int sub1 = 10 - a.c;
        int sub2 = 10 - a.d;
        X x1 = new X();
        System.out.println(X.p);
        x1.testMethod();
    X.addition();
        System.out.println("protected " + sub);
        System.out.println("default variable " + sub1);
        System.out.println("public " + sub2);
        a.test1();
        a.test2();
        a.test3();
    }
}
