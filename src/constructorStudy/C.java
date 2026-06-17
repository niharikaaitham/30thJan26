package constructorStudy;

public class C {
    static void main(String[] args) {
C c=new C();
C c1=new C(1);

    }
    public C(){
        int a=1;
        int b=2;
        int sum=a+b;
        System.out.println(sum);
    }
    public C(int a){
        System.out.println(a);
    }
}
