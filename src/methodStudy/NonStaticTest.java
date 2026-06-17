package methodStudy;

public class NonStaticTest {
    //20. Write a program with a non-static method that prints your roll number and call it using an
    //object.
    static void main(String[] args) {
        NonStaticTest nonStaticTest=new NonStaticTest();
        nonStaticTest.test();
    }
    public void test(){
        int rollNumber=20;
        System.out.println(rollNumber);
    }
}
