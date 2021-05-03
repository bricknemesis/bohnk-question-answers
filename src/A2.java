
import java.lang.Math;

public class A2 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        double dim1 = getRandomNumber(1, 10);
        double dim2 = getRandomNumber(1, 10);
        double h = Math.pow(dim1, 2);
        double area = dim1 * dim2;
        double perimeter = dim1*2 + dim2*2;
        double volume = dim1 * dim2 * h;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
