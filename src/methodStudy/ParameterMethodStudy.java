package methodStudy;

public class ParameterMethodStudy {
    static void main(String[] args) {
ParameterMethodStudy parameterMethodStudy=new ParameterMethodStudy();
    parameterMethodStudy.test(1);
    parameterMethodStudy.test(1,2);
    }
    public void test(int a){
        System.out.println(a);
    }
    public void test(int a,int b) {
        int sum=a+b;
        System.out.println(sum);
    }
}
