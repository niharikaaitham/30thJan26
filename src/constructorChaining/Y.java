package constructorChaining;

public class Y extends X{
    int a=10;
    static void main(String[] args) {
Y y=new Y();
    }
    public Y(){
        this(10);
        System.out.println("without parameter from Y class");

    }
    public Y(int a){
        super("name");

        System.out.println("with int parameter from Y class");
    }
    public Y(String a){
        this('S');
        System.out.println("with string parameter from Y class");
    }
    public Y(char a){
        System.out.println("with char parameter from Y class");
        System.out.println(a);

    }
}
