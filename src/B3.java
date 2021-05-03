import java.lang.Math;

public class B3 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        double angle = getRandomNumber(0, 80);
        int shadow = getRandomNumber(1, 30);
        double height = Math.tan(angle) * shadow;
        System.out.println("Height = " + height);
    }
}
