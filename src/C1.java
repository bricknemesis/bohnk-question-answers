public class C1 {
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int ran = getRandomNumber(60, 500);
        float sideLength = ran / 2.0f; //this is true because since a square has equal length on both sides, the area will be 2 * l (or w), so dividing by 2 will give a side
        System.out.println("Area chosen: " + ran);
        System.out.println("Side length: " + sideLength);
    }
}
