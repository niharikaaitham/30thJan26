package controlStatement;

public class SwitchCase2 {
    //seasons -->summer, winter, rainy and its conditions
    static void main(String[] args) {
        String season = "autumn";
        switch (season) {
            case "summer":
                System.out.println("Hot");
                break;
            case "winter":
                System.out.println("Cold");
                break;
            case "rainy":
                System.out.println("wet");
                break;
            default:
                System.out.println("Enter valid season name");
        }

    }
}