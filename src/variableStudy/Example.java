package variableStudy;

public class Example {
        int instanceVar = 5;  // Non-static instance variable
        static int staticVar = 10;

        static void staticMethod() {
            // Create an object of the class
            Example obj = new Example();

            // Access instance variable through the object
            System.out.println(obj.instanceVar);  // ✅ 5

            // Access static variable directly
            System.out.println(staticVar);        // ✅ 10
        }

        public static void main(String[] args) {
            staticMethod();
        }
    }

