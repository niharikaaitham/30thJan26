package thisAndSuperKeyword;

public class C {
    String language;

   public C() {
        this.language = "Java";
        System.out.println("Java lang");
    }


    public C(String language)
    {
        this.language = language;

    }

    public void getName()
    {
        System.out.println("Programming Language: " + this.language);
    }

    public static void main(String[] args) {


        C obj1 = new C();
        C obj2 = new C("Python");

        obj1.getName();
        obj2.getName();
    }
}

