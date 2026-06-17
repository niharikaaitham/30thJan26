package loopStatements;

public class IncrementDecrement {
    static void main(String[] args) {
        int m = 1;
        int p = m++; //m value is assigned to p first and then m value is incremented by 1
        System.out.println("For post increment: ");
        System.out.println("value of m: " + m);
        System.out.println("value of p: " + p);
        int n=2;
        int q = ++n; //n value is incremented first and then incremented value is assigned to q
        System.out.println("For pre increment: ");
        System.out.println("value of n: " + n);
        System.out.println("value of q: " + q);
        int a=5;
        int x=a--;
        System.out.println("For post decrement: ");
        System.out.println("value of a: " + a);
        System.out.println("value of x: " + x);
        int b=2;
        int y=--b;
        System.out.println("For pre decrement: ");
        System.out.println("value of b: " + b);
        System.out.println("value of y: " + y);
    }
}
