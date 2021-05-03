
import java.lang.Math;

public class A3 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int ran = getRandomNumber(20, 120);
        int ran2 = getRandomNumber(3, 8);
        System.out.println(ran % ran2);
    }
}
