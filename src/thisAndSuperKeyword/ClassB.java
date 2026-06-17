package thisAndSuperKeyword;

public class ClassB extends ClassA{
    int a=20;
    int b=50; //global variables

    static void main(String[] args) {
ClassB classB=new ClassB();
classB.show();
    }
    public void display(){
        System.out.println("Hi");
    }
    public void show(){
        int a=50;
        int b=30; //local variables
        int sum=a+b;
        int sum1=this.a+b;
        int sum2=super.a+10;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);



    }
}
