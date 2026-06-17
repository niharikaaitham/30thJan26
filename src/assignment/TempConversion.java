package assignment;

public class TempConversion {
    //program that uses a variable for temperature in Celsius and converts it to Fahrenheit.
    static void main(String[] args) {
        //Default 37degrees Celsius; Default- 98.6 Fahrenheit
        //Formula=(°C × 9/5) + 32 = 32°F
        // tempInFahrenheit = 98.6f;

        float tempInCelsius = 37f;
        // Convert Celsius to Fahrenheit: F = C * 9/5 + 32
        float convertedF = (tempInCelsius * 9 / 5) + 32;

        System.out.println("Given Celsius     : " + tempInCelsius);
        System.out.println("Converted F      : " + convertedF);

    }
}

