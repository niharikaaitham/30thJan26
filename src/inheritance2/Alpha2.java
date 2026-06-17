package inheritance2;

import inheritance1.Alpha;

public class Alpha2 extends Alpha {


    static void main(String[] args) {
        Alpha alpha = new Alpha();
        System.out.println(Alpha.b);
        System.out.println(alpha.d);
        alpha.test3();
        Alpha2 alpha2=new Alpha2(); //created object of subclass
        alpha2.test1(); //To call protected, we have to class this class object

    }
}