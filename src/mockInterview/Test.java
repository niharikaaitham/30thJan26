package mockInterview;

public class Test {
        static {
            System.out.println("Static");
        }

        {
            System.out.println("Instance");
        }

    {
        System.out.println("Hi");
    }
        Test() {

            System.out.println("Constructor");
        }

        public static void main(String[] args) {
            new Test();
        }
    }

