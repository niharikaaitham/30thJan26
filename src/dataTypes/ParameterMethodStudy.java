package dataTypes;

public class ParameterMethodStudy {
    static void main(String[] args) {
        ParameterMethodStudy parameterMethodStudy = new ParameterMethodStudy();
        parameterMethodStudy.addition();
        parameterMethodStudy.addition(10, 20);
    }

    public void addition() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
    }

    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }
}
