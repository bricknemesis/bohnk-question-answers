
import java.lang.Math;

public class B2 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static double round(double input, int decimalPlaces){
        double mult = Math.pow(10, decimalPlaces);
        return Math.floor(input * mult + 0.5) / mult;
    }

    public static void main(String[] args) {
        int celsius = getRandomNumber(-40, 40);
        double fahrenheit = round(9/5f * celsius + 32, 1);

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}