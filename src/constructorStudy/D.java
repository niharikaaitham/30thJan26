package constructorStudy;

public class D {
    int a=1;
    int b=2;
    static void main(String[] args) {
D d=new D();
D d1=new D(10,20);
    }
    public D(){
        int sum=a+b;
        System.out.println(sum);
    }
    public D(int a,int b){
        int sum1=a+b;
        System.out.println(sum1);
    }


}
