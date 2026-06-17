package variableStudy;

public class VarSameClass {
    int a = 100;
    static int b = 20;

    static void main(String[] args) {
        VarSameClass varSameClass = new VarSameClass();
        int sub = VarSameClass.b - 1;
        int sub1 = varSameClass.a - 1;
        System.out.println(sub);
        System.out.println(sub1);

    }

}
