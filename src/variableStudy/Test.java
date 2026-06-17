package variableStudy;

public class Test {
    int a=1;
    static int b=2;
    static void main(String[] args) {
Test test=new Test();
test.add();
sub();
    }
    public void add(){
        int a=10;
        int sum=this.a+b;
        System.out.println(sum);
    }
    public static void sub(){
        int a=100;
        int b=200;
        int sum=Test.b+a;
        System.out.println(sum);
    }
}
