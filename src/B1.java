
import java.lang.Math;

public class B1 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int roll1 = getRandomNumber(1, 6);
        int roll2 = getRandomNumber(1, 6);
        int sum = roll1 + roll2;
        int difference = roll1 - roll2;
        double frac = roll1 / (double) roll2; //must have denominator as double so integer division is not carried out, weird as fuck

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Fraction: " + frac);
    }
}
