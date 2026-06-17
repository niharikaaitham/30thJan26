package assignment;

public class CaseSensitive {
    // 27. Write a program that shows how variable names are case-sensitive in Java.
    static void main(String[] args) {
        int age = 1;
        int Age = 2;
        int AGe = 3;
        int AGE = 4;
        System.out.println("age: " + age);
        System.out.println("Age: " + Age);
        System.out.println("AGe: " + AGe);
        System.out.println("AGE: " + AGE);
    }
}
