package Encapsulation;

public class B {
    static void main(String[] args) { //data hiding and controlled access
        A a=new A();
        a.deposit(1000);
        a.withdraw(100);
    }
}
