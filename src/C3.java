
import java.lang.Math;

public class C3 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int mark1 = getRandomNumber(1, 100);
        int mark2 = getRandomNumber(1, 100);
        int mark3 = getRandomNumber(1, 100);
        int mark4 = getRandomNumber(1, 100);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Mark 4: " + mark4);
        System.out.println("Average: " + ( (mark1 + mark2 + mark3 + mark4) / 4f) );
    }
}
