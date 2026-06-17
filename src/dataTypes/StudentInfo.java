package dataTypes;

public class StudentInfo {
    static void main(String[] args) {
        studentData(); //calling method using mymethod(); for static method
        //creating object using classname objectname=new classname(); as it is->non-static
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.studentData("niha", 28,80.1f); //objectname.methodname(); ->calling method

    }

    public static void studentData() {  //there is return type as we have used void
        String name = "Niha";
        int age = 15;
        float marks = 82.1f;
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My marks are " + marks);

    }

    public void studentData(String name, int age, float marks) {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My marks are " + marks);

    }


}



