package Encapsulation;

public class A {
    private int balance=10; //variables are private

    public void withdraw(int a){    //methods should be with parameters and made public to access the variables through methods
        balance=balance-a;
        System.out.println("Balance after withdrawal: " +balance);
    }
    public void deposit(int a){
        balance=balance+a;
        System.out.println("Balance after deposit: " +balance);
    }
}
