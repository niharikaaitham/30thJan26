package controlStatement;

public class LeapYear {
    //1.	Divisible by 400 → Always a Leap Year (e.g., 2000, 1600)
    //2.	Divisible by 100 but NOT 400 → NOT a Leap Year (e.g., 1900, 2100)
    //3.	Divisible by 4 but NOT 100 → Leap Year (e.g., 2024, 2028)
    //4.	Not divisible by 4 → NOT a Leap Year (e.g., 2023)
    static void main(String[] args) {
        int year = 3000;
        if (year % 400 == 0) {
            System.out.println("Always a Leap Year");
        } else if (year % 100 == 0){
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}

