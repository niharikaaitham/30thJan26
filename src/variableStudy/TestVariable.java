package variableStudy;

public class TestVariable {
    int a=1;
    static int b=2;

    static void main(String[] args) {
        TestVariable z=new TestVariable();
        int sum=z.a+TestVariable.b;
        System.out.println(sum);
    }
}
